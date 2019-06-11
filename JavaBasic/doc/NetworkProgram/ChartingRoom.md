## java聊天室
多线程操作 多人聊天

客户端：

```
package socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

// 客户端 client
// 改进：从控制台输入信息
public class Client {

    public static void main(String[] args) throws IOException {
        // 本机ip地址为 127.0.0.1
        // 它的别名     localhost
        // 端点
        Socket socket =
                new Socket("127.0.0.1", 5555);
//        socket.getOutputStream().write("hello".getBytes());

        // 接收消息的线程
        new Thread(()->{
            try {
                InputStream is = socket.getInputStream();
                while(true) {
                    byte[] buf = new byte[1024];
                    int len = is.read(buf);
                    if(len == -1) {
                        break;
                    }
                    String content = new String(buf, 0, len);
                    System.out.println(content);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            // 从控制台反复读入内容
            String line = scanner.nextLine();
            socket.getOutputStream().write(line.getBytes());
        }
//        socket.close();
    }
}

```
服务器：

```
package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 要支持多个客户端连接, 要记录所有的客户端socket，并给客户端socket发送信息
public class Server3 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5555);
        ExecutorService threadPool = Executors.newCachedThreadPool();
        // 集合用来保存所有的客户端socket
        ConcurrentHashMap<Socket, SocketAddress> map = new ConcurrentHashMap<>();

        System.out.println("ready... 等待客户端连接");
        while(true) {
            Socket socket = ss.accept(); // 每连接一个新的用户调用一次accept
            map.put(socket, socket.getRemoteSocketAddress()); // 将客户socket存入map
            // 让线程池中的线程来处理这次请求
            threadPool.submit(()->{
                try {
                    InputStream is = socket.getInputStream();
                    SocketAddress address = socket.getRemoteSocketAddress();
                    byte[] buf = new byte[1024];
                    while(true) {
                        int len = is.read(buf);
                        if(len==-1){
                            break;
                        }
                        String content = address + " " + new String(buf, 0, len);// 获取某个客户端发过来的消息内容
//                        System.out.println(address+" "+new String(buf,0,len));
                        // 遍历map集合
                        for (Socket clientSocket : map.keySet()) {
                            // 向客户端socket写入消息内容
                            OutputStream os = clientSocket.getOutputStream();
                            os.write(content.getBytes());
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}

```
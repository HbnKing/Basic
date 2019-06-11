java中的网络编程
Socket API 对tcp、udp协议做了封装，能够连接到对方主机，收发数据

tcp的例子


服务器端：
```
public static void main(String[] args) throws IOException {
    // 可以与客户端的socket建立连接  端口号一般使用4位以上的数字
    ServerSocket ss = new ServerSocket(5555);
    System.out.println("ready...等待客户端连接");
    // 端点
    Socket socket = ss.accept();// 等待客户端连接我服务器方法，直到有客户端连接
}
```
客户端：
```
public static void main(String[] args) throws IOException {
    // 本机ip地址为 127.0.0.1
    // 它的别名     localhost
    // 端点
    Socket socket =
            new Socket("127.0.0.1", 5555);
}

```
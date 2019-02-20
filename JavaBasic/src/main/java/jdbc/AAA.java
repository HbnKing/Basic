package jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;

/**
 * Created by zhanpeng on 2016/10/14.
 */
@Component
public class FileWriterService {

    @Value("${file.path}")
    String path;

    FileOutputStream fileOutputStream;

    @PostConstruct
    public void init() throws FileNotFoundException {
        System.out.println("Class FileWriterService Method init");
        // open file
        File file = new File(this.path);
        if(file.exists())
        {
        }
        else
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fileOutputStream = new FileOutputStream(file);
    }

    public void write(String content){
        System.out.println("Class FileWriterService Method write Debug [content]:" + content);
        //write content to the file
        byte [] str_bytes = content.getBytes();
        try {
            fileOutputStream.write(str_bytes,0,str_bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Class FileWriterService Method destroy");
        // close file
        if(fileOutputStream != null)
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
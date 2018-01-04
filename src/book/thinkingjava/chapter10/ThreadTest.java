package book.thinkingjava.chapter10;
  

public class ThreadTest {  
      
    public void function(String a) {  
          
        new Thread(){  
            @Override  
            public void run() {  
                System.out.println(a);  
            }  
        }.start();  
    }  
      
      
    public static void main(String[] args) {  
        new ThreadTest().function("a");  
          
    }  
}  
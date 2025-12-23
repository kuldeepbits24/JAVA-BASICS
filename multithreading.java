import java.util.*;

public class multithreading{
    public static class multithreads extends Thread {
               private String threadname; 
             public  void newThread(String name) {
                threadname = name; 
            } 
            public void run(){
                System.out.println(threadname + " is running..."); 
            }
    }

    public static void main(String[] args){
        newThread thread1 = new newThread("Thread 1. "); 

    }
}
import java.util.*;

public class Abstraction{
     public static abstract class UsingAbstract{
        public abstract void show(); 
     }
     public static class ChildAbstract extends UsingAbstract {
        @Override
        public void show(){
            System.out.println("Chile class is showing..."); 
        }
     }



    public static void main(String[] args){
            UsingAbstract cab = new ChildAbstract();
            cab.show(); 
    }
}

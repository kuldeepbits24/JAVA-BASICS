public class interfacess {
    interface A {
        int age = 44;
        String area = "area44"; 
        void show();
        void config(); 
    }

    interface X {
       void run(); 
    }
   public static class B implements A,X{
         public void show() {
            System.out.println("Now the showing function is working..."); 
         }
         public void config() {
            System.out.println("Now the Config Function is working...");
         }
         public void run() {
            System.out.println("Now the run function is running..."); 
         }
    }


    public static void main(String[] args) {
           A obj; 
           obj = new B(); 
           obj.show();
           obj.config();
           
           X obj1 = new B();
           obj1.run();  


        //    A.area = "Hyderabad";         // we cannot change the variable area because it is final as defined in the interface. 
    }
    
}

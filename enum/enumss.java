 
// this is about enums use in JAVA. 
public class enumss {
enum Status{
    Running, Failed, Pending, Success; 
}

    public static void main(String[] args) {
            int i =5; 
            // Status s = Status.Running; 
            // System.out.println(s); 

            Status[] ss = Status.values(); 

            for(Status s :ss) {
                 System.out.println(s);
            }
    }
}

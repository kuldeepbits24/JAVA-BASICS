
    class A {
        public void show() {
            System.out.println("Showing A here...");
        }
    }
public class Anonymous_Inner_class {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Showing new Function...");
            }
        };
        obj.show();  // Outputs: "Showing new Function..."
    }
}

public class methods {
    
    public static void main(String[] args) {
        // method = a block of called that's executed whenever it is called upon

        // String name = "Bro";
        // int age = 18;

        hello("Bro", 18);

        System.out.println(add(1,2));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name + ". Your are " + age);
    }

    static int add(int a, int b) {
        return a + b;
    }
}

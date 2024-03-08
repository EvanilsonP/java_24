public class overLoadedMethods {

    public static void main(String[] args) {
        // overloaded methods = methods that share the same name but have different parameters
        // method name + parameters = method signature

        System.out.println(add(1,2,3,4));
        System.out.println(add(1.0,2.0));

    }

    static int add(int a, int b) {
        System.out.println("This is a overloaded method number 1.");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is a overloaded method number 2.");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is a overloaded method number 3.");
        return a + b + c + d;
    } 

    static double add(double a, double b) {
        System.out.println("This is a overloaded method number 4.");
        return a + b;
    }
}
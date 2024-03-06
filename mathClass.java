public class mathClass {

    public static void main(String[] args) {

        double x = 3.15;
        double y = -10;

        double z = Math.max(x, y);
        double a = Math.min(x, y);

        double b = Math.abs(y);
        double c = Math.round(x);
        
        double d = Math.ceil(x);
        double e = Math.floor(x);

        System.out.println(z); // input x
        System.out.println(a); // input y
        System.out.println(b); // input y / 10
        System.out.println(b); // input y / 10
        System.out.println(c); // input c / 3.0
        System.err.println(d); // input d / 4.0
        System.err.println(e); // input d / 3.0

    }
}

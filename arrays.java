public class arrays {
    
    public static void main(String[]args) {

        // String[] cars = { "camaro", "covertte", "tesla" };
        // cars[0] = "mustang";

        // System.out.println(cars[0]);

        String[] cars = new String[3];

        cars[0] = "camaro";
        cars[1] = "covertte";
        cars[2] = "tesla";

        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

package OOP;

public class Main {
    
    public static void main(String[] args) {
        // This is an instance of our Class Car
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        System.out.println();

        myCar.drive();
        myCar.brake();


    }
}

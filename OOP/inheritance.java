package OOP;

public class inheritance {
    
    public static void main(String[] args) {

        Car3 car3 = new Car3();
        car3.go();

        System.out.println();

        Bycicle bike = new Bycicle();
        bike.stop();

        System.out.println("The car have " + car3.doors + " doors.");
        System.out.println("The bike have " + bike.pedals + " pedals.");
    }
}

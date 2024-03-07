package exercices;

import java.util.Scanner;

public class findHypótenuseOfATriangle {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter side x: ");
        x = scanner.nextDouble();

        System.err.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The result is: " + z);

        scanner.close();
    }
}
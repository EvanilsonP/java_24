import java.util.Scanner;

public class ifStatements {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are u? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if(age >= 18) {
            System.out.println("You can drive.");

        } else {
            System.out.println("You cannot drive");
        }

        scanner.close();
    }
}

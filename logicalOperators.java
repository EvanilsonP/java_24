import java.util.Scanner;

public class logicalOperators {
    
    public static void main(String[] args) {

        // Logical operators are used to connect two or more expressions
        // !
        // ||
        // &&

        int temp = 25;

        if(temp > 30) {
            System.out.println("It is hot outside.");

        } else if(temp >= 20 && temp <= 30) {
            System.out.println("It is warm outisde.");

        } else {
            System.out.println("It is cold outside.");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing the game! Press q or Q to quit the game.");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game.");

        } else {
            System.out.println("You are still playing the game. ");
        }

        scanner.close();
    }
}

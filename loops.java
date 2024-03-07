import java.util.Scanner;

public class loops {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // WHILE LOOP
        // User needs to provide a name
        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        scanner.close();


        // FOR LOOP 
        for(int i = 10; i >= 0; i --) {
            System.out.println(i);
        }
        System.out.println("Happy new year!");
    }
}

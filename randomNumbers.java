import java.util.Random;

public class randomNumbers {
    
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6)+1;
        System.err.println(x); // Output is a number among 1 and 6

        double y = random.nextDouble();
        System.out.println(y); // Output is a double between 0 and 1
        
        boolean z = random.nextBoolean();
        System.out.println(z); // Output is either true or false
        
    }
}

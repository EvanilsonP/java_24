public class printf {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // printf = an optional method to control, format and display text to the console window
        // System.out.printf("%d this is a format string", 123);

        @SuppressWarnings("unused")
        boolean myBoolean = true;
        @SuppressWarnings("unused")
        char myChar = '#';
        String myString = "Bro";
        int myInt = 12;
        double myDouble = 1000;

        // Convertion characters
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // Width
        // Minimum number of characters to be written as output
        // System.out.printf("Hello %10s", myString); // Hello          Bro

        // Precision
        // Sets numbers of precision 
        // System.out.printf("You have this much money %.2f", myDouble); // 1000.00

        // Flags
        // Adds an effect to ouput based on the flag added to format specifier
        System.out.printf("You have this much money %,f", myDouble); // 1000,00



    }
}

public class stringMethods {
    
    public static void main(String[] args) {

        String name = "Bro";

        boolean result = name.equals("Bro");
        boolean result1 = name.equals("bro");
        boolean result2 = name.equalsIgnoreCase("bro");

        int result3 = name.length();
        char result4 = name.charAt(0);
        int result5 = name.indexOf("o");

        boolean result6 = name.isEmpty();
        String result7 = name.toUpperCase();
        String result8 = name.replace("Bro", "Brother");

        System.out.println(result); // true
        System.out.println(result1); // false
        System.out.println(result2); // true

        System.out.println(result3); // 3
        System.out.println(result4); // B
        System.out.println(result5); // 2
        System.out.println(result6); // True, because String name = "Bro" is not empty
        System.out.println(result7); // BRO
        System.out.println(result8); // BRO


    }
}

import java.util.ArrayList;

public class forEachLoop {
    
    public static void main(String[] args) {
        // for each = traversinbg technique to iterate through the elements in an array/collection
        // Less steps, more readable
        // less flexible

    //     String[] animals = { "cat", "dog", "rat", "bird" };
    //     // for every String i : animals // : means in
    //     for(String i : animals) {
    //         System.out.println(i);
    //     }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    ArrayList<String> animals = new ArrayList();
    animals.add("cat");
    animals.add("dog");
    animals.add("rat");

    for(String i : animals) {
        System.out.println(i);
    }

    }
}

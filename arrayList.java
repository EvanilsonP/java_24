import java.util.ArrayList;

public class arrayList {
    
    public static void main(String[] args) {
        // Array List = A resizable array
        // Elements can be added and removed after compilation phase
        // Store reference types

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hotdog");
        food.add("Hamburguer");
        // Replacing Pizza with Sushi
        food.set(0, "Sushi");
        // Removing Hamburgue r
        food.remove(2);
        // Eating all the food
        food.clear();

        // With Array Lists we use size() and not lengt h
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}

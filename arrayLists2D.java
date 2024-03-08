import java.util.ArrayList;

public class arrayLists2D {
    
    public static void main(String[] args) {
        // 2D Array List = a dynamic list of lists
        // You can change the size of these list during runtime

        @SuppressWarnings({ "rawtypes", "unchecked" })
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        System.out.println(bakeryList.get(0)); // Pasta

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        System.out.println(produceList.get(1)); // zucchini

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("water");
        drinkList.add("soda");

        System.out.println(drinkList.get(1)); // Soda

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

        System.out.println(groceryList); // Shows all lists 
        System.out.println(groceryList.get(0)); // Grabs the bakeryList
        System.out.println(groceryList.get(0).get(0)); // Grabs 'pasta' from bakeryList

        System.out.println(groceryList.get(2).get(1)); // Grabs soda from the drinkList

    }
}

package OOP;

public class arrayOfObjects {
    
    public static void main(String[] args) {

        //Food[] refrigetator = new Food[3];


        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        Food[] refrigetator = { food1, food2, food3 };

        // refrigetator[0] = food1;
        // refrigetator[1] = food2;
        // refrigetator[2] = food3;

        System.out.println(refrigetator[0].name);
        System.out.println(refrigetator[1].name);
        System.out.println(refrigetator[2].name);

    } 
}

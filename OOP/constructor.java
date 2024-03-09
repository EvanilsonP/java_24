package OOP;

public class constructor {
    
    public static void main(String[] args) {
        // Constructor is a special method that's called when an object is instantiated (created);
        Human human = new Human("Rick", 25, 70);
        Human human2 = new Human("Pedro", 50, 150);

        System.out.println(human.name);
        human.eat();

        System.out.println();

        human.drink();
        System.out.println();
        
        System.out.println(human2.name);
        System.out.println();
        human2.eat();
    }
}
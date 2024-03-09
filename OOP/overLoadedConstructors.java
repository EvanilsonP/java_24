package OOP;
 
public class overLoadedConstructors {
     // Overloaded constructors = multiple constructors within a class with the same name, but have different parameters
    // name + parameters = singnature
    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust", "tomato", "muzzarella");

        System.out.println("Here are the ingrendients: ");
        System.out.println();
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);

        System.out.println(pizza.topping); // null
    }

}

package OOP;

public class staticKeyWor {
    
    public static void main(String[] args) {
    
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");


        System.out.println(Friend.numberOfFriends); 
        Friend.displayNumberOfFriends();
    }
}

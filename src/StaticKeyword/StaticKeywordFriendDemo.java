package StaticKeyword;

public class StaticKeywordFriendDemo {
    String name;
    static int numberOfFriends;
    StaticKeywordFriendDemo(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends ");
    }
}

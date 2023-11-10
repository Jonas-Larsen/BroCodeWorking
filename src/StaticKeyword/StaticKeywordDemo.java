package StaticKeyword;

public class StaticKeywordDemo {
    public static void main(String[] args) {

        // Static = modifier. A single copy of a variable/method is created and shared.
        //          The class "owns" the static member

        StaticKeywordFriendDemo friend1 = new StaticKeywordFriendDemo("Batman");
        StaticKeywordFriendDemo friend2 = new StaticKeywordFriendDemo("Superman");
        StaticKeywordFriendDemo friend3 = new StaticKeywordFriendDemo("IronMan");
        StaticKeywordFriendDemo friend4 = new StaticKeywordFriendDemo("Wonder Woman");

       // System.out.println("This is how many friends you have: " +StaticKeywordFriendDemo.numberOfFriends);

        StaticKeywordFriendDemo.displayFriends();

    }
}

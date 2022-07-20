package Tutorial.ObjectProgramming.statickeyword;

import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) {
        

            // Static = modifier. A single copy of varible/method is created and shared.
            //                  The class "owns" the static memeber 
    
                Friend friend1 = new Friend("Bill");
                Friend friend2 = new Friend("James");
                Friend friend3 = new Friend("Edgar");
                Friend friend4 = new Friend("Justin");


                Friend.displayFriends();
    }
}

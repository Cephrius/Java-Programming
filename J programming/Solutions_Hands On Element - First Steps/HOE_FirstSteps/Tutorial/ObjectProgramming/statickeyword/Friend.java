package Tutorial.ObjectProgramming.statickeyword;


public class Friend {

        String name;
        static int numberOfFriends;
    
    // this constructor requires you to send in a name....
        Friend(String name){
            this.name = name;
            numberOfFriends++;


        }
        static void displayFriends(){
            System.out.println("You have "+numberOfFriends+" Friends.");
        }
}

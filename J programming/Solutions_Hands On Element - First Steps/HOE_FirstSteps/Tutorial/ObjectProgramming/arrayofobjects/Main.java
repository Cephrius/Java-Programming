package Tutorial.ObjectProgramming.arrayofobjects;

public class Main {
    public static void main(String[] args) {
        
        //Food[] refridgerator = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hambuger");
        Food food3 = new Food("hotdog");

        // Writing this line of code makes it easier to enter values and uses less lines of code.
        Food[] refridgerator = {food1,food2,food3};

        // This is the more longer version of writing the same function above but with more lines of code :( 

        /*refridgerator[0] = food1;
        refridgerator[1] = food2;
        refridgerator[2] = food3;
        */
            System.out.println(refridgerator[0].name);
            System.out.println(refridgerator[1].name);
            System.out.println(refridgerator[2].name);
    }
}

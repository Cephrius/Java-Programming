package Tutorial.Lessons;
import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        

        //String[] animals = {"cat","dog","mouse","bird"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");
        animals.add("bird");


        for(String i : animals) {
            System.out.println(i);
        }
    }
}

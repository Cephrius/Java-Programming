package Tutorial.ObjectProgramming.superkeyword;

public class Main {
    public static void main(String[] args) {

                // Super = keyword refers to the superclass(parent) of an object
                //          very similar to the "this" keyword


                Hero hero1 = new Hero("Batman",42,"Super Speed");
                Hero hero2 = new Hero("Superman", 25, "Laser Eyes");

                System.out.println(hero1.name);
                System.out.println(hero1.age);
                System.out.println(hero1.power);
                System.out.printf(hero2.name);
                System.out.println(hero2.age);
                System.out.println(hero2.power);
        
    }
}

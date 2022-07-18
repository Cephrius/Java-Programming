package Tutorial.ObjectProgramming.methodoverriding;

public class Main {
    public static void main(String[] args) {

                // method overriding = Declaring a method in sub class/child class,
                //                     which is already present in parent class.
                //                     done so that a child calss can give its own implementation.

                Animal animal = new Animal();
                Dog dog = new Dog();

                animal.speak();

    }
}

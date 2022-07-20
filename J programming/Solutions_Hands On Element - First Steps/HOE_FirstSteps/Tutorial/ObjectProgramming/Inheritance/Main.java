package Tutorial.ObjectProgramming.Inheritance;

public class Main {
    
    public static void main(String[] args) {
        
            // inheritance = the process in where one class acquires, 
            //               the atributes and methods of another. 
            // in order to use inheritance in another class you must use the 'EXTENDS' keyword
            // Parent class = the class in where the child class get their data and structure from
            // Child class = this class gets its data from the parent class and uses it.

         Car car = new Car();

        //car.go();

        Bicycle bike = new Bicycle();

        //bike.stop();

        System.out.println(bike.pedals);
        System.out.println(car.doors);


            
 
            
    }
}
 
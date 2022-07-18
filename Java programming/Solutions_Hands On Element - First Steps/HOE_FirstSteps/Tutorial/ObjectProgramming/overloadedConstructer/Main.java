package Tutorial.ObjectProgramming.overloadedConstructer;

public class Main {
    public static void main(String[] args) {
        //overloaded constructers = multiple constructors within a class with the same name,
        //                          but have different paramerters
        //                          name + parameters = signature

        Pizza pizza = new Pizza();
    
            System.out.println("Here are the ingredients of your pizza: ");
            
            System.out.println(pizza.bread);
            System.out.println(pizza.cheese);
            System.out.println(pizza.sauce);
            System.out.println(pizza.toppings);
    

    }
}

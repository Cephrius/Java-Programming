package Tutorial.ObjectProgramming;

    public class Main {
        public static void main(String[] args) {
            
            // Encapsulation = attributes of a class will be hidden or private
            //                 can be accessed only through methods(getters & setters )
            //                 You should make attributes private if you dont have a reason to make them public/protected 
        
            Car car = new Car("Tesla", "Model S", 2022);
    
               car.setYear(2018);

                    System.out.println(car.getMake());
                    System.out.println(car.getModel());
                    System.out.println(car.getYear());

               
        }
    }


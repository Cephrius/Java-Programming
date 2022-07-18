package Tutorial.ObjectProgramming.OOP;

public class Car {
           
        String make ;
        String model ;
        int year ;
        
        Car(String make, String model, int year){

                this.make = make;
                this.model = model;
                this.year = year;
        }

        void drive(){
            System.out.println("You drive the " +this.make +this.model);
        }
        void brake(){
            System.out.println("You slow down the Car");
        }
    }


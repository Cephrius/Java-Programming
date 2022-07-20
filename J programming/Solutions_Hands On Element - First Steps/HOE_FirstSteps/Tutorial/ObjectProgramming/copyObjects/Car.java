public class Car {
    
        String make;
        String model;
        int year;

        Car(String make, String model, int year){
                this.setMake(make);
                this.setModel(model);
                this.setYear(year);
        };
        // Simpler way of making a copy method 
        Car(Car x){
            this.copy(x);
        };

    // Getter Methods
        public String getMake(){
            return make;
        };

        public String getModel(){
            return model;
        };

        public int getYear(){
            return year;
        };
    // Setter Methods
        public void setMake(String make){
            this.make = make;
        };

        public void setModel(String model ){
            this.model = model;
        };

        public void setYear(int year){
            this.year = year;
        };
        // Method made to copy object wihout having same address 
        public void copy(Car x ){
            this.setMake(x.getMake());
            this.setModel(x.getModel());
            this.setYear(x.getYear());

        }

}

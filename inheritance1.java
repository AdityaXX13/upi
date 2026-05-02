
    class car{
        String name;
        String model;
        String color;
        int mileage;
        int no_of_gears;

        car(String name, String model, String color, int mileage, int no_of_gears){
            this.name = name;
            this.model = model;
            this.color = color;
            this.mileage = mileage;
            this.no_of_gears = no_of_gears;
        }
    

        void start(){
            System.out.println("car is starting");
        }
        void apply_brakes(){
            System.out.println("car is applying brakes");
        }
        void apply_speed(){
            System.out.println("car is applying speed");
        }
         void shift_gear(){
            System.out.println("car is shifting gear");
       }
        
    }
    class Audi extends car{
        int seater;
       Audi(String name, String model, String color, int mileage, int no_of_gears, int seater){
            super(name, model, color, mileage, no_of_gears);
            this.seater = seater;
        }
                    
        }

public class inheritance1 {
    public static void main(String[] args) {
        Audi a= new Audi("Audi", "A4", "black", 10, 6, 5);
        a.start();
        a.apply_brakes();
        a.apply_speed();
        a.shift_gear();

        System.out.println("Car name: " + a.name);
    }
}

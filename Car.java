import java.awt.*;

enum Make {
    Acura, Afeela, AlfaRomeo, Audi, BMW, Bentley, Buick, Cadillac, Chevrolet, Chrysler,
    Dodge, Fiat, Fisker, Ford, GMC, Genesis, Honda, Hyundai, Infiniti, Jaguar,
    Jeep, Kia, LandRover, Lexus, Lincoln, Lotus, Lucid, Maserati, Mazda,MercedesBenz, Mercury, Mini,
    Mitsubishi, Nissan, Polestar, Pontiac, Porsche, Ram, Rivian, RollsRoyce, Saab,Saturn, Scion,
    Scout, Smart, Subaru, Suzuki, Tesla, Toyota, Volkswagen, Volvo
}
public class Car {
    private Make make;
    private String model;
    private int year;
    private Color color;
    public Car (Make make, String model, int year, Color color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void drive () {
        System.out.println("Now we are driving");
    }
    public void stop () {
        System.out.println("Stop engine");
    }
    public void displayInfo () {
        System.out.println("New Car " + make + " " + model + " " + year + " " + color);
    }
}
class DemoCar {
    public static void main(String[] args) {
        Car demoCar = new Car(Make.Toyota, "Camry", 2020, Color.red);
        demoCar.displayInfo();
    }
}

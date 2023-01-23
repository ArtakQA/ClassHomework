public class Computer {
    private String brand;
    private String model;
    private int year;
    private String cpu;
    private int ram;
    private int storage;
    public Computer (String brand, String model, int year, String cpu, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    public void displaySpecifications() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
    }

    public void runProgram(String programName) {
        System.out.println("Running " + programName + "...");
    }
}
class DemoComputer {
    public static void main(String[] args) {

        Computer HPX360 = new Computer("HP", "X360", 2022,
                "12th Generation Intel® Core™ i5 processor", 8, 512);
        HPX360.runProgram("IntelliJ IDEA Community Edition 2022.2.2");
        HPX360.displaySpecifications();
    }
}

public class Car extends Vehicle {
    //New Property
    int doors;
    //Car constructor
    public Car( String licenseNumber,String make,String model,double price,int doors){
        super(licenseNumber,make,model,price);
        this.doors=doors;

    }

    //Setting Car Doors
    public void setDoors(int doors) {
        this.doors = doors;
    }

    //Getting Car Doors
    public int getDoors() {
        return doors;
    }

    //printing Car Doors
    public String toString() {
        return super.toString()+"\nNumber of doors: "+getDoors();
    }

    //Car Drive Method
    public void drive() {
        System.out.println("--------------------");
        System.out.println("CAR------------->CAR");
        System.out.println("--------------------");

    }
}
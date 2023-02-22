public class Truck extends Vehicle {
    // New Property
    double maximumLoad ;
    //Truck Constructor
    public Truck(String licenseNumber,String make,String model,double price,double maximumLoad){
        super(licenseNumber,make,model,price);
        this.maximumLoad = maximumLoad;

    }

    //setting The maximum load
    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    //getting  The maximum load
    public double getMaximumLoad() {
        return maximumLoad;
    }


    //Printing The maximum load
    public String toString() {
        return super.toString()+"\nMaximum load (Ton): "+getMaximumLoad();
    }

    //Truck Drive Method
    public void drive() {
        System.out.println("--------------------");
        System.out.println("TRUCK--------->TRUCK");
        System.out.println("--------------------");

    }
}
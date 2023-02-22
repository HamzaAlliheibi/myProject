public abstract class Vehicle {
    //Properties
    String licenseNumber;
    String make;
    String model;
    double price;


    //Print Properties Method
    public String toString() {
        return "License # : " + getLicenseNumber() + "\nVehicle: " + getMake() + " " +
                getModel() + "\nPrice : " + getPrice();
    }
    //Vehicle constructor
    public Vehicle(String licenseNumber, String make , String model , Double price){
        this.licenseNumber = licenseNumber;
        this.make = make;
        this.model = model;
        this.price = price;
    }
    //Getters
    public String getLicenseNumber(){
        return licenseNumber;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price ;
    }
    //Drive Method
    public abstract void drive();

}
public class Bus extends Vehicle {
    //New property
    int Seats;
    //Bus Constructor
    public Bus(String licenseNumber,String make,String model,double price,int Seats){
        super(licenseNumber,make,model,price);
        this.Seats = Seats;
    }

    //setting Bus's seats
    public void setSeats(int seats) {
        this.Seats = seats;
    }

    //Getting Bus's seats
    public int getSeats() {
        return Seats;
    }

    //printing Bus's seats
    public String toString() {
        return super.toString()+"\nNumber of seats: "+getSeats();
    }

    //Bus Drive Method
    public void drive() {
        System.out.println("--------------------");
        System.out.println("BUS------------->BUS");
        System.out.println("--------------------");

    }
}
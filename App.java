import java.util.Vector;
public class App {
    public static void main(String[] args) throws Exception {
        //new object
        Vector<Vehicle> vehicles = new Vector<>();
        //printing the details
        vehicles.add(new Car("FG1000", "Honda", "Civic", 100000.00, 4));
        vehicles.add(new Car("AY3000", "Bugatti", "Veyron", 300000.00, 2));
        vehicles.add(new Bus("BUS123", "Toyota", "Bus", 5000000, 35));
        vehicles.add(new Truck("TRK321", "Hyundai", "T1A", 300000, 10));
        // printing the drive method>>
        for (Vehicle veh : vehicles) {
            System.out.println();
            System.out.println(veh);
            veh.drive();
        } }
}
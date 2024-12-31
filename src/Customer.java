import java.util.ArrayList;
import java.util.List;



public class Customer {
    private String name;
    private List<Vehicle> rentedVehicles = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }

    public void setName(){
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle,int days){
        rentedVehicles.add(vehicle);

    }
    public void returnVehicle(Vehicle vehicle){
        rentedVehicles.remove(vehicle);
    }

}

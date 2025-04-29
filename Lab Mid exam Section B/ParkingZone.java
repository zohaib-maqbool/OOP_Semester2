import java.util.Arrays;

public class ParkingZone {
    private int zonecounter=1;
    private String zoneid;
    private Vehicle[] vehicles = new Vehicle[5];
    private int vehiclecount=0;

    public ParkingZone(){
        this.zoneid= "A"+zonecounter++;
    }

    @Override
    public String toString() {
        return "ParkingZone{" +
                "zonecounter=" + zonecounter +
                ", zoneid='" + zoneid + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                ", vehiclecount=" + vehiclecount +
                '}';
    }

    public void addVehicle(Vehicle v){
        if(vehiclecount<5){
            vehicles[vehiclecount++]=v;
        }else{
            System.out.println("Zonefull");
        }

    }


}

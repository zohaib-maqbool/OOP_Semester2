import java.util.Arrays;
import java.util.ArrayList;

public class ParkingSystem {
    private static ParkingSystem instance;
    private String Campusname;
    Supervisor supervisor;
    ParkingZone[] zones= new ParkingZone[2];

    public String getCampusname() {
        return Campusname;
    }

    public void setCampusname(String campusname) {
        Campusname = campusname;
    }

    public ParkingSystem(String campusname, Supervisor supervisor) {
        Campusname = campusname;
        this.supervisor = supervisor;
    }

    public static ParkingSystem getInstance(String Campusname, Supervisor supervisor){
        instance = new ParkingSystem(Campusname,supervisor);
        return instance;
    }

    public void addZone(ParkingZone zone){
        zone.add(zone);
    }

    public void addPermitHolder(PermitHolder ph){

    }

    @Override
    public String toString() {
        return "ParkingSystem{" +
                "Campusname='" + Campusname + '\'' +
                ", supervisor=" + supervisor +
                ", zones=" + Arrays.toString(zones) +
                '}';
    }
}

public class Vehicle {
    private String regno;
    private String type;
    Owner owner;

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Vehicle(String regno,String type,Owner owner) {
        this.regno = regno;
        this.type=type;
        this.owner=owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "regno='" + regno + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

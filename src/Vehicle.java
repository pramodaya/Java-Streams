public class Vehicle {
    private String name;
    private String releaseYear;
    private int usedYears;
    private VehicleType vehicleType;

    public Vehicle(String name, String releaseYear, int usedYears, VehicleType vehicleType) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.usedYears = usedYears;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getUsedYears() {
        return usedYears;
    }

    public void setUsedYears(int usedYears) {
        this.usedYears = usedYears;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", releaseYear='" + releaseYear + '\'' +
                ", usedYears=" + usedYears +
                ", vehicleType=" + vehicleType +
                '}';
    }
}

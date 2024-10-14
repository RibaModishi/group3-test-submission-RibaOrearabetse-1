// Abstract class RoadConstruction
abstract class RoadConstruction implements IRoadsConstructed {
    // Variables to store city name and total roads constructed
    protected String city;
    protected int totalRoadsConstructed;
    
    // Constructor for initializing city and total roads constructed
    public RoadConstruction(String city, int totalRoadsConstructed) {
        this.city = city;
        this.totalRoadsConstructed = totalRoadsConstructed;
    }
    
    // Implementing the getCity method from IRoadsConstructed
    public String getCity() {
        return city;
    }
    
    // Implementing the getTotalRoadsConstructed method from IRoadsConstructed
    public int getTotalRoadsConstructed() {
        return totalRoadsConstructed;
    }
    
    // Abstract method to print the road construction report
    public abstract void printRoadsConstructed();
}
import java.util.Scanner;

// Assuming RoadConstruction is defined elsewhere
public class Question2 extends RoadConstruction {
    // Constructor to initialize RoadConstructionReport with city and total roads
    public Question2(String city, int totalRoadsConstructed) {
        super(city, totalRoadsConstructed);
    }
    
    // Method to print the road construction report
    @Override
    public void printRoadsConstructed() {
        System.out.println("                         ");
        System.out.println("ROAD CONSTRUCTION REPORT");
        System.out.println("*************************");
        System.out.println("CITY: " + getCity());
        System.out.println("ROADS CONSTRUCTED: " + getTotalRoadsConstructed());
        System.out.println("*************************");
    }
    
    // Main method to run the application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Prompt user to enter the city for road construction
            System.out.print("Enter the city for road construction: ");
            String city = input.nextLine();
            
            // Prompt user to enter the total number of road constructions for that city
            System.out.print("Enter the total road constructions for " + city + ": ");
            int totalRoadsConstructed = input.nextInt();
            
            // Create a new instance of Question2 (RoadConstructionReport)
            Question2 roadReport = new Question2(city, totalRoadsConstructed);
            
            // Print the road construction report
            roadReport.printRoadsConstructed();
        } finally {
            // Close the scanner to prevent resource leaks
            input.close();
        }
    }
}

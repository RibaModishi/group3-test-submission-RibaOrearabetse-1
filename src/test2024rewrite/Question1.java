/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2024rewrite;

import java.util.Scanner;

/**
 *
 * @author Ore
 */
public class Question1 extends City {
    
    // Constructor for Question1 that calls the City constructor
    public Question1(String city) {
        super(city);
    }
    
    // Scanner object for input
    Scanner input = new Scanner(System.in);
    
    // Method to calculate total road constructions per city
    public double calculateRoadsConstructed(double[] roadsConstructed) {
        double totalRoads = 0;
        for (double road : roadsConstructed) {
            totalRoads += road;  // Sum up all the constructions
        }
        return totalRoads;  // Return total constructions
    }
    
    // Static method to find the top-performing city based on total road constructions
    public static int topCityConstructions(double[] totalRoads) {
        int topCityIndex = 0;
        double maxRoads = totalRoads[0];  // Assume first city has the max roads initially
        for (int i = 1; i < totalRoads.length; i++) {
            if (totalRoads[i] > maxRoads) {  // If another city has more constructions
                maxRoads = totalRoads[i];
                topCityIndex = i;  // Update index of the top city
            }
        }
        return topCityIndex;  // Return the index of the top city
    }
    
    // Main method to run the application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create three City objects
        Question1 capeTown = new Question1("Cape Town");
        Question1 johannesburg = new Question1("Johannesburg");
        Question1 portElizabeth = new Question1("Port Elizabeth");

        // Create a 2D array to store road construction data for each city
        double[][] roadsConstructed = new double[3][1];

        // Input roads constructed for Cape Town
        System.out.println("Enter the number of roads constructed for Cape Town: ");
        roadsConstructed[0][0] = input.nextDouble();

        // Input roads constructed for Johannesburg
        System.out.println("Enter the number of roads constructed for Johannesburg: ");
        roadsConstructed[1][0] = input.nextDouble();

        // Input roads constructed for Port Elizabeth
        System.out.println("Enter the number of roads constructed for Port Elizabeth: ");
        roadsConstructed[2][0] = input.nextDouble();

        // Calculate total constructions for each city
        double[] totalRoads = new double[3];  // To store total constructions for each city
        totalRoads[0] = capeTown.calculateRoadsConstructed(roadsConstructed[0]);
        totalRoads[1] = johannesburg.calculateRoadsConstructed(roadsConstructed[1]);
        totalRoads[2] = portElizabeth.calculateRoadsConstructed(roadsConstructed[2]);

        // Display the construction report
        System.out.println("-------------------------------------------------------");
        System.out.println("ROAD CONSTRUCTION REPORT");
        System.out.println("-------------------------------------------------------");
        System.out.println("                                ROADS CONSTRUCTED");
        System.out.println(capeTown.getCity() + ":      " + roadsConstructed[0][0]);
        System.out.println(johannesburg.getCity() + ":   " + roadsConstructed[1][0]);
        System.out.println(portElizabeth.getCity() + ": " + roadsConstructed[2][0]);
        System.out.println("-------------------------------------------------------");
        
        
        // Determine the top city based on road constructions
        int topCityIndex = Question1.topCityConstructions(totalRoads);
        String[] cityNames = {capeTown.getCity(), johannesburg.getCity(), portElizabeth.getCity()};
        System.out.println("CITY WITH THE MOST ROAD CONSTRUCTIONS: " + cityNames[topCityIndex]);
    }
}

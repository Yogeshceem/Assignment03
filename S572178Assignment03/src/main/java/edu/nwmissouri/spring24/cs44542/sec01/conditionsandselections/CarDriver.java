/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01.conditionsandselections;

import java.util.Scanner;

/**
 *
 * @author S572178
 */
import java.util.Scanner;



public class CarDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Northwest Car Showroom");

        // Brand selection
        System.out.println("\nPlease select what brand motor you are looking for");
        System.out.println("1. Ford\n2. Chevrolet\n3. Almost\n4. Nissan\n5. Toyota");

        int brandChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate brand choice
        if (brandChoice < 1 || brandChoice > 5) {
            System.out.println("Error, you have selected an invalid brand.");
            return;
        }

        // Model selection
        System.out.println("Please select your desired model");
        String[] models = {"Mustang", "Explorer", "Escape", "Fusion", "F-150"};
        for (int i = 0; i < models.length; i++) {
            System.out.println((i + 1) + ". " + models[i]);
        }

        int modelChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate model choice
        if (modelChoice < 1 || modelChoice > models.length) {
            System.out.println("Error, you have selected an invalid model.");
            return;
        }

        // Safety star rating selection
        System.out.println("Please select the safety star rating that you prefer");
        double[] starRatings = {3.0, 3.8, 4.0, 4.5, 5.0};
        for (int i = 0; i < starRatings.length; i++) {
            System.out.println((i + 1) + "." + starRatings[i]);
        }

        double starRatingChoice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Validate star rating choice
        boolean validStarRating = false;
        for (double rating : starRatings) {
            if (starRatingChoice == rating) {
                validStarRating = true;
                break;
            }
        }

        if (!validStarRating) {
            System.out.println("Error, you have selected an invalid safety star rating value.");
            return;
        }

        // Steering type selection
        System.out.println("Please select your preferred steering type");
        System.out.println("1. Power steering\n2. Manual steering");

        int steeringChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Validate steering choice
        if (steeringChoice < 1 || steeringChoice > 2) {
            System.out.println("Error, you have selected an invalid steering type.");
            return;
        }

        // Special features selection
        System.out.println("Are you interested in adding a new feature?");
        System.out.println("1. Yes\n2. No");

        int featureChoice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String specialFeature = "";
        if (featureChoice == 1) {
            System.out.println("Please select any one of the special features");
            System.out.println("1. AI/Voice controlled\n2. Hybrid\n3. Electric");

            int specialFeatureChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Validate special feature choice
            if (specialFeatureChoice < 1 || specialFeatureChoice > 3) {
                System.out.println("Error, you have selected an invalid special feature.");
                return;
            }

            specialFeature = specialFeatureChoice == 1 ? "AI/Voice Controlled" :
                             specialFeatureChoice == 2 ? "Hybrid" : "Electric";
        }

        // Create Car object with selected options
        Car car = new Car(models[modelChoice - 1], getBrand(brandChoice), getSteeringType(steeringChoice),
                          getBasePrice(models[modelChoice - 1], getBrand(brandChoice)),
                          specialFeature, starRatingChoice);

        // Print final details
        car.printDetails();
    }

    private static String getBrand(int choice) {
        switch (choice) {
            case 1:
                return "Ford";
            case 2:
                return "Chevrolet";
            case 3:
                return "Tata";
            case 4:
                return "Nissan";
            case 5:
                return "Toyota";
            default:
                return "";
        }
    }

    private static String getSteeringType(int choice) {
        return choice == 1 ? "Power steering" : "Manual steering";
    }

    private static double getBasePrice(String model, String brand) {
        switch (brand) {
            case "Toyota":
                switch (model) {
                    case "Camry":
                        return 24255.99;
                    case "Corolla":
                        return 22500.99;
                    case "RAV4":
                        return 26500.00;
                    case "Prius":
                        return 24560.12;
                    case "Highlander":
                        return 24788.50;
                }
                break;
            case "Nissan":
                switch (model) {
                    case "Altima":
                        return 23555.00;
                    case "Rogue":
                        return 25500.00;
                    case "Pathfinder":
                        return 23899.99;
                    case "Titan":
                        return 24778.99;
                    case "Nano":
                        return 20000.59;
                }
                break;
            case "Tata":
                switch (model) {
                    case "Indica":
                        return 18567.58;
                    case "Silverado":
                        return 25233.55;
                    case "Malibu":
                        return 24544.67;
                    case "Equinox":
                        return 22000.50;
                    case "Traverse":
                        return 23766.55;
                }
                break;
            case "Chevrolet":
                switch (model) {
                    case "Camaro":
                        return 16550.99;
                    case "Mustang":
                        return 21599.76;
                    case "Explorer":
                        return 18976.59;
                    case "Escape":
                        return 19999.09;
                    case "Fusion":
                        return 12765.78;
                }
                break;
            case "Ford":
                switch (model) {
                    case "F-150":
                        return 19876.98;
                }
                break;
        }
        return 0.0;
    }
}

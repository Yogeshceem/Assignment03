/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec01.conditionsandselections;

/**
 *
 * @author S572178
 */
import java.util.Scanner;

import java.util.Scanner;

class Car {
    private String model;
    private String brand;
    private String steering;
    private double price;
    private String splFeature;
    private double starRating;

    public Car(String model, String brand, String steering, double price, String splFeature, double starRating) {
        this.model = model;
        this.brand = brand;
        this.steering = steering;
        this.price = price;
        this.splFeature = splFeature;
        this.starRating = starRating;
    }

    // Getter and Setter methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSplFeature() {
        return splFeature;
    }

    public void setSplFeature(String splFeature) {
        this.splFeature = splFeature;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    // toString method
    public String toString() {
        return "\nCUSTOMIZED DETAILS\nBrand: " + brand +
                "\nModel: " + model +
                "\nSteering type: " + steering +
                "\nStar rating: " + starRating +
                "\nSpecial feature: " + splFeature +
                "\nPrice: $" + price +
                "\nTotal: $" + calculateTotalPrice();
    }

    // Additional methods
    public double calculateTotalPrice() {
        double totalPrice = price;
        totalPrice += totalPrice * 0.10; // SALES_TAX
        totalPrice += totalPrice * 0.03; // EXCISE_TAX
        totalPrice += totalPrice * 0.05; // REGISTRATION_TAX
        return totalPrice;
    }

    public double getSplFeature(String feature) {
        switch (brand) {
            case "Toyota":
                switch (feature) {
                    case "AI/Voice Controlled":
                        return 3013.58;
                    case "Hybrid":
                        return 6768.75;
                    case "Electric":
                        return 9876.83;
                }
                break;
            case "Ford":
                switch (feature) {
                    case "AI/Voice Controlled":
                        return 2513.58;
                    case "Hybrid":
                        return 3768.75;
                    case "Electric":
                        return 5876.83;
                }
                break;
            case "Chevrolet":
                switch (feature) {
                    case "AI/Voice Controlled":
                        return 3513.58;
                    case "Hybrid":
                        return 4768.75;
                    case "Electric":
                        return 8876.83;
                }
                break;
            case "Tata":
                switch (feature) {
                    case "AI/Voice Controlled":
                        return 1513.58;
                    case "Hybrid":
                        return 2768.75;
                    case "Electric":
                        return 3876.83;
                }
                break;
            case "Nissan":
                switch (feature) {
                    case "AI/Voice Controlled":
                        return 2013.58;
                    case "Hybrid":
                        return 4768.75;
                    case "Electric":
                        return 6876.83;
                }
                break;
        }
        return 0.0;
    }

    public double getSteering(String type) {
        switch (brand) {
            case "Toyota":
                return type.equals("Power steering") ? 1001.75 : 0.0;
            case "Ford":
                return type.equals("Power steering") ? 2234.25 : 0.0;
            case "Chevrolet":
                return type.equals("Power steering") ? 1765.50 : 0.0;
            case "Tata":
                return type.equals("Power steering") ? 1252.35 : 0.0;
            case "Nissan":
                return type.equals("Power steering") ? 2762.49 : 0.0;
        }
        return 0.0;
    }

    public double getStarRating(double num) {
        switch (brand) {
            case "Toyota":
                switch ((int) num) {
                    case 1:
                        return 1784.75;
                    case 2:
                        return 2341.89;
                    case 3:
                        return 3451.95;
                    case 4:
                        return 3482.18;
                    case 5:
                        return 5232.25;
                }
                break;
            case "Ford":
                switch ((int) num) {
                    case 1:
                        return 1384.75;
                    case 2:
                        return 2041.89;
                    case 3:
                        return 2451.95;
                    case 4:
                        return 2982.18;
                    case 5:
                        return 3232.25;
                }
                break;
            case "Chevrolet":
                switch ((int) num) {
                    case 1:
                        return 1484.75;
                    case 2:
                        return 2041.89;
                    case 3:
                        return 2851.95;
                    case 4:
                        return 2982.18;
                    case 5:
                        return 4232.25;
                }
                break;
            case "Tata":
                switch ((int) num) {
                    case 1:
                        return 1884.75;
                    case 2:
                        return 2441.89;
                    case 3:
                        return 3551.95;
                    case 4:
                        return 3882.18;
                    case 5:
                        return 2232.25;
                }
                break;
            case "Nissan":
                switch ((int) num) {
                    case 1:
                        return 1084.75;
                    case 2:
                        return 1341.89;
                    case 3:
                        return 1751.95;
                    case 4:
                        return 1982.18;
                    case 5:
                        return 3232.25;
                }
                break;
        }
        return 0.0;
    }

    public void printDetails() {
        System.out.println(this.toString());
    }
}
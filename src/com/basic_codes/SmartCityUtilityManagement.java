package com.basic_codes;

import java.util.Scanner;

// Base Class
class Utility {
    String citizenName;
    int citizenId;

    // Constructor
    Utility(String citizenName, int citizenId) {
        this.citizenName = citizenName;
        this.citizenId = citizenId;
    }

    // Polymorphic method
    double calculateBill() {
        return 0.0; // default
    }

    void displayDetails() {
        System.out.println("Citizen ID: " + citizenId);
        System.out.println("Citizen Name: " + citizenName);
    }
}

// Derived Class: Electricity
class Electricity extends Utility {
    int units;

    Electricity(String citizenName, int citizenId, int units) {
        super(citizenName, citizenId);
        this.units = units;
    }

    @Override
    double calculateBill() {
        return units * 5.0; // Rs.5 per unit
    }
}

// Derived Class: Water
class Water extends Utility {
    int liters;

    Water(String citizenName, int citizenId, int liters) {
        super(citizenName, citizenId);
        this.liters = liters;
    }

    @Override
    double calculateBill() {
        return liters * 2.0; // Rs.2 per liter
    }
}

// Derived Class: PropertyTax
class PropertyTax extends Utility {
    double propertyValue;

    PropertyTax(String citizenName, int citizenId, double propertyValue) {
        super(citizenName, citizenId);
        this.propertyValue = propertyValue;
    }

    @Override
    double calculateBill() {
        return propertyValue * 0.01; // 1% of property value
    }
}

// Main Class
public class SmartCityUtilityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input citizen details
        System.out.print("Enter Citizen ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Citizen Name: ");
        String name = sc.nextLine();

        // Electricity
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();
        Electricity e = new Electricity(name, id, units);

        // Water
        System.out.print("Enter water consumption (liters): ");
        int liters = sc.nextInt();
        Water w = new Water(name, id, liters);

        // Property Tax
        System.out.print("Enter property value: ");
        double propertyValue = sc.nextDouble();
        PropertyTax p = new PropertyTax(name, id, propertyValue);

        // Consolidated Report
        System.out.println("\n--- Consolidated Utility Report ---");
        e.displayDetails();
        System.out.println("Electricity Bill: Rs." + e.calculateBill());
        System.out.println("Water Bill: Rs." + w.calculateBill());
        System.out.println("Property Tax: Rs." + p.calculateBill());

        sc.close();
    }
}

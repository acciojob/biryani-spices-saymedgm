package com.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpiceRepo {
    private Map<String, Double> spiceMap;

    public SpiceRepo() {
        this.spiceMap = new HashMap<>();
    }

    public void addSpice(String name, double quantity) {
    	//your code goes here
    }

    public double getSpiceQuantity(String name) {
    	//your code goes here
        if (spiceMap.containsKey(name)) {
            return spiceMap.get(name);
        } else {
            throw new IllegalArgumentException("Spice not found: " + name);
        }
    }

    public void updateSpiceQuantity(String name, double newQuantity) {
    	//your code goes here
    }

    public void removeSpice(String name) {
    	//your code goes here
    }

    public double calculateTotalQuantity() {
    	//your code goes here
        return totalQuantity;
    }

    public static void main(String[] args) {
        SpiceRepo spiceRepo = new SpiceRepo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Add Spice");
        System.out.println("2. Get Spice Quantity");
        System.out.println("3. Update Spice Quantity");
        System.out.println("4. Remove Spice");
        System.out.println("5. Calculate Total Quantity");
        System.out.println("6. Exit");

        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter spice name:");
                    String spiceName = scanner.next();
                    System.out.println("Enter quantity:");
                    double spiceQuantity = scanner.nextDouble();
                    spiceRepo.addSpice(spiceName, spiceQuantity);
                    break;
                case 2:
                    System.out.println("Enter spice name:");
                    String getSpiceName = scanner.next();
                    spiceRepo.getSpiceQuantity(getSpiceName);
                    break;
                case 3:
                    System.out.println("Enter spice name:");
                    String updateSpiceName = scanner.next();
                    System.out.println("Enter new quantity:");
                    double newQuantity = scanner.nextDouble();
                    spiceRepo.updateSpiceQuantity(updateSpiceName, newQuantity);
                    break;
                case 4:
                    System.out.println("Enter spice name to remove:");
                    String removeSpiceName = scanner.next();
                    spiceRepo.removeSpice(removeSpiceName);
                    break;
                case 5:
                    spiceRepo.calculateTotalQuantity();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

package CRM_project;

import java.util.Scanner;

public class customermodule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        // Input and calculate interaction points
        System.out.print("How many times has the customer interacted? ");
        int interactions = sc.nextInt();
        int loyaltyPoints = interactions * 2;

        // Input and calculate deal value points
        System.out.print("Enter total deal value (₹): ");
        double dealValue = sc.nextDouble();

        if (dealValue >= 50000) {
            loyaltyPoints += 10;
        } else if (dealValue >= 20000) {
            loyaltyPoints += 5;
        }

        // Display results
        System.out.println("\n--- Customer Summary ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Interactions: " + interactions);
        System.out.println("Total Deal Value: ₹" + dealValue);
        System.out.println("Total Loyalty Points: " + loyaltyPoints);

        // Determine loyalty status
        if (loyaltyPoints >= 20) {
            System.out.println("Loyalty Status: PLATINUM");
        } else if (loyaltyPoints >= 15) {
            System.out.println("Loyalty Status: GOLD");
        } else if (loyaltyPoints >= 10) {
            System.out.println("Loyalty Status: SILVER");
        } else {
            System.out.println("Loyalty Status: Needs more engagement");
        }

        sc.close();
    }
}

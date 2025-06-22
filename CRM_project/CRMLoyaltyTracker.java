package CRM_project;
import java.util.Scanner;

class Customer {
    int id;
    String name;
    int interactions;
    double dealValue;
    int loyaltyPoints = 0;

    void getCustomerDetails(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("How many times has the customer interacted? ");
        interactions = sc.nextInt();
        loyaltyPoints += interactions * 2;
        System.out.print("Enter total deal value (₹): ");
        dealValue = sc.nextDouble();
        if (dealValue >= 50000) {
            loyaltyPoints += 10;
        } else if (dealValue >= 20000) {
            loyaltyPoints += 5;
        }
    }

    void showCustomerSummary() {
        System.out.println("\n--- Customer Summary ---");
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Total Interactions: " + interactions);
        System.out.println("Total Deal Value: ₹" + dealValue);
        System.out.println("Total Loyalty Points: " + loyaltyPoints);
        if (loyaltyPoints >= 20) {
            System.out.println("Loyalty Status: PLATINUM");
        } else if (loyaltyPoints >= 15) {
            System.out.println("Loyalty Status: GOLD");
        } else if (loyaltyPoints >= 10) {
            System.out.println("Loyalty Status: SILVER");
        } else {
            System.out.println("Loyalty Status: Needs more engagement");
        }
    }

    int getRating(Scanner sc) {
        System.out.print("Enter customer rating for salesperson (1 to 5): ");
        return sc.nextInt();
    }
}

class Salesperson {
    int id;
    String name;
    int deals;
    int bonus = 0;
    int total = 0;

    void getSalespersonDetails(Scanner sc) {
        System.out.print("Enter Salesperson ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Salesperson Name: ");
        name = sc.nextLine();
        System.out.print("Enter number of deals closed: ");
        deals = sc.nextInt();
    }

    void calculateEarnings(int rating) {
        total = deals * 2500;
        if (rating >= 4) {
            bonus = 2000;
        }
        total += bonus;
    }

    void showSalespersonSummary() {
        System.out.println("\n--- Salesperson Summary ---");
        System.out.println("Salesperson ID: " + id);
        System.out.println("Salesperson Name: " + name);
        System.out.println("Deals Closed: " + deals);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Earnings: ₹" + total);
    }
}

public class CRMLoyaltyTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Customer
        Customer c = new Customer();
        c.getCustomerDetails(sc);
        c.showCustomerSummary();

        // Salesperson
        Salesperson s = new Salesperson();
        s.getSalespersonDetails(sc);
        int rating = c.getRating(sc);
        s.calculateEarnings(rating);
        s.showSalespersonSummary();

        sc.close();
    }
}

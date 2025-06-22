package CRM_project;

 import java.util.Scanner;
 
 public class SalesPersonModule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Salesperson details
        System.out.print("Enter Salesperson ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Salesperson Name: ");
        String name = sc.nextLine();

        // Input number of deals
        System.out.print("Enter number of deals closed: ");
        int deals = sc.nextInt();

        // Calculate payment
        int payment = deals * 2500;

        // Input rating and calculate bonus
        System.out.print("Enter customer rating (1 to 5): ");
        int rating = sc.nextInt();
        int bonus = 0;
        if (rating >= 4) {
            bonus = 2000;
        }

        // Calculate total earnings
        int total = payment + bonus;

        // Output
        System.out.println("\n--- Salesperson Summary ---");
        System.out.println("Salesperson ID: " + id);
        System.out.println("Salesperson Name: " + name);
        System.out.println("Deals Closed: " + deals);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Earnings: ₹" + total);

        sc.close();
    }
}

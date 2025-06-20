package CRM_project;

import java.time.LocalDate;

public class Interaction {
    public static void main(String[] args) {
        int interactionId = 985634;
        String interactionType = "Call";
        String interactionNotes = "Discussed product features and pricing";
        LocalDate interactionDate = LocalDate.of(2023, 6, 15);
        int customerId = 1743744;
        String employeeName = "Alice Johnson";

        // Printing values
        System.out.println("Interaction ID: " + interactionId);
        System.out.println("Interaction Type: " + interactionType);
        System.out.println("Interaction Notes: " + interactionNotes);
        System.out.println("Interaction Date: " + interactionDate);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Employee Name (Handled): " + employeeName);
    }
}
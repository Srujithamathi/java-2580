package CRM_project;

import java.time.LocalDate;

public class SalesOppurtunity {
    public static void main(String[] args) {
        int opportunityId = 102938;
        String opportunityName = "Product X Deal";
        double dealValue = 5000.00;
        LocalDate opportunityCloseDate = LocalDate.of(2023, 7, 20);
        String opportunityStage = "Negotiation";
        int leadId = 124578;
        String accountManagerName = "Bob Martin";

        // Printing values
        System.out.println("Sales Opportunity ID: " + opportunityId);
        System.out.println("Sales Opportunity Name: " + opportunityName);
        System.out.println("Deal Value: " + dealValue);
        System.out.println("Opportunity Close Date: " + opportunityCloseDate);
        System.out.println("Opportunity Stage: " + opportunityStage);
        System.out.println("Lead ID: " + leadId);
        System.out.println("Account Manager: " + accountManagerName);
    }
}
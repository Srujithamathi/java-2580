package CRM_project;

import java.time.LocalDate;

public class SalesLead {
    public static void main(String[] args) {
        int leadId = 124578;
        String leadName = "Jane Smith";
        String leadEmail = "jane.smith@lead.com";
        long leadPhone = 9876543210L;
        String leadSource = "Web";
        LocalDate leadCreationDate = LocalDate.of(2023, 5, 30);
        String leadStatus = "New";
        double estimatedDealValue = 5000.00;

        // Printing values
        System.out.println("Sales Lead ID: " + leadId);
        System.out.println("Sales Lead Name: " + leadName);
        System.out.println("Sales Lead Email: " + leadEmail);
        System.out.println("Sales Lead Phone: " + leadPhone);
        System.out.println("Sales Lead Source: " + leadSource);
        System.out.println("Sales Lead Creation Date: " + leadCreationDate);
        System.out.println("Sales Lead Status: " + leadStatus);
        System.out.println("Estimated Deal Value: " + estimatedDealValue);
    }
}
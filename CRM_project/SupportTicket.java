package CRM_project;

import java.time.LocalDate;

public class SupportTicket {
    public static void main(String[] args) {
        String ticketId = "TICKET12345";
        String issueDescription = "Login issue";
        String ticketStatus = "In Progress";
        LocalDate ticketCreationDate = LocalDate.of(2023, 6, 10);
        int customerId = 1743744;
        String supportAgentName = "Sarah Lee";

        // Printing values
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Issue Description: " + issueDescription);
        System.out.println("Ticket Status: " + ticketStatus);
        System.out.println("Ticket Creation Date: " + ticketCreationDate);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Support Agent Name: " + supportAgentName);
    }
}
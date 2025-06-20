package CRM_project;

import java.time.LocalDate;

public class Customer {
    public static void main(String[] args) {
        int customerId = 1743744;
        String customerFirstName = "John";
        String customerLastName = "Doe";
        char customerGender = 'M';
        byte customerAge = 25;
        String customerAddress = "123 Main St, Anytown, USA";
        int postalNo = 54302;
        long customerPhone = 9834561239L;
        String customerEmail = "john.doe@example.com";
        LocalDate dateCreated = LocalDate.of(2023, 6, 12);
        short createdByEmpId = 456;
        boolean isActive = true;

        // Printing values
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerFirstName + " " + customerLastName);
        System.out.println("Customer Gender: " + customerGender);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Postal Number: " + postalNo);
        System.out.println("Customer Phone: " + customerPhone);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Customer Date Created: " + dateCreated);
        System.out.println("Created By Employee ID: " + createdByEmpId);
        System.out.println("Customer is Active: " + isActive);
    }
}
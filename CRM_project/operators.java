package CRM_project;

public class operators {
    public static void main(String[] args) {

        int customerId = 1234;
        String customerName = "john";
        double totalPurchase = 4500.0;
        int interactionCount = 45;
        int leadId = 345;
        double leadBudget = 2500;
        boolean isContacted = true;
        double opportunityValue = 4563;
        boolean isClosed = false;

        double avgPurchases = totalPurchase / interactionCount;
        boolean saleopp = opportunityValue > 5000;
        boolean isPrioritised = leadBudget > 3000 && isContacted;
        interactionCount++;

        System.out.println("customer Id: " + customerId);
        System.out.println("customer Name: " + customerName);
        System.out.println("Lead Status: " + isContacted);
        System.out.println("Average Purchases: " + avgPurchases);
        System.out.println("Sales opportunity: " + saleopp);
        System.out.println("Is Prioritised: " + isPrioritised);
        System.out.println("Interaction Count after increment: " + interactionCount);
    }
}
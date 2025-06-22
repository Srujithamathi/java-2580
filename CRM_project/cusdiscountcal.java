package CRM_project;

public class cusdiscountcal {
    public static void main(String[] args) {
        int customerId = 101;
        String customerName = "John";
        boolean isPremium = true;
        byte yearsPartnership = 3;
        double baseDiscount = 0.0;
        double extraDiscount = 0.0;
        String dealStage = "Negotiation";
        double dealValue = 50000;

        if (isPremium) {
            baseDiscount = 0.10;
        } else if (yearsPartnership >= 3) {
            baseDiscount = 0.05;
        } else {
            baseDiscount = 0;
        }

        // Ternary
        baseDiscount = isPremium ? 0.10 : yearsPartnership >= 3 ? 0.05 : 0;

        switch (dealStage) {
            case "Negotiation":
                extraDiscount = 0.03;
                break;
            case "Proposal":
                extraDiscount = 0.02;
                break;
            case "Closed":
                extraDiscount = 0.05;
                break;
            default:
                extraDiscount = 0;
                break;
        }

        double totalDiscount = baseDiscount + extraDiscount;
        double finalDiscount = totalDiscount * dealValue;
        double finalDealValue = dealValue - finalDiscount;

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Is Premium: " + isPremium);
        System.out.println("Years Partnership: " + yearsPartnership);
        System.out.println("Deal Stage: " + dealStage);
        System.out.println("Deal Value: " + dealValue);
        System.out.println("Base Discount using ternary:  " + (baseDiscount * 100) + "%");
        System.out.printf("Base Discount: %.2f%%\n", baseDiscount * 100);
        System.out.printf("Extra Discount: %.2f%%\n", extraDiscount * 100);
        System.out.printf("totalDiscount: %.2f%%\n", totalDiscount * 100);
        System.out.printf("Final Discount:%.2f\n ", finalDiscount);
        System.out.println("Final Deal Value: " + finalDealValue);

    }
}
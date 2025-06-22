public class Inventorymanagement {
    public static void main(String[] args) {
        String productname = "Apple";
        int prodQuantity = 157;
        float unitPrice = 25.0f;
        int reOrder = 200;
        boolean isAvail = true;
        int totalQuantity = prodQuantity + reOrder;
        boolean prodAvail = prodQuantity < reOrder;
        boolean quant = isAvail && prodQuantity > 1;
        prodQuantity--;
        System.out.println("Product Name: " + productname);
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Availability: " + prodAvail);
        System.out.println("Quantity: " + quant);
        System.out.println("Product Quantity: " + prodQuantity);

    }

}
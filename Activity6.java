public class Activity6 {
    public static void main(String[] args) {

        String customerName = "Jace";
        double Shorty = 299.50;
        double Vandal = 1200.75;
        double Phantom = 450.25;

        double total = Shorty + Vandal + Phantom;
        double vat = total * 0.12;
        double grandTotal = total + vat;
        int wholeTotal = (int) grandTotal;


        System.out.println("ONLINE SHOPPING RECEIPT");
        System.out.println("Customer: " + customerName);
        System.out.println("Shorty: " + Shorty);
        System.out.println("Vandal: " + Vandal);
        System.out.println("Phantom: " + Phantom);


        System.out.println("Subtotal: " + total);
        System.out.println("VAT: " + vat);
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Whole Number: " + wholeTotal);
        System.out.println("Free Shipping: " + (total > 1500));
    }
}
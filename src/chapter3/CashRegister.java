package chapter3;

public class CashRegister {
    private double purchase; // стоимость покупки
    private double payment; // платеж
    private int itemCount;
    private double purchaseTax;
    private double generalPurchaseTax;
    private double totalTax;

    public double giveChange() {
        double change = payment - purchase;
        System.out.println("Tax rate: " + purchaseTax * 100.0 + " %");
        System.out.println("General purchase tax: " + generalPurchaseTax);
        System.out.println("Purchase: " + purchase);
        System.out.println("Payment: " + payment);
        purchase = 0;
        payment = 0;
        totalTax = 0;
        generalPurchaseTax = 0;
        return change;
    }

    public CashRegister(double taxRate) {
        this.purchaseTax = taxRate / 100.0;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void recordTaxablePurchase(double amount) {
        purchase += amount + amount * purchaseTax;
        generalPurchaseTax += amount * purchaseTax;
        itemCount++;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public static void main(String[] args) {
        CashRegister register = new CashRegister(10);
        register.recordTaxablePurchase(130);
        register.recordTaxablePurchase(20);
        register.recordPurchase(10);
        register.receivePayment(200);
        System.out.println("Change: " + register.giveChange());
    }
}

package chapter6;

public class PhoneBill {

    private int id;
    private int allottedMinutes;
    private int minutesUsed;
    private double baseCost;
    public PhoneBill(){
        id = 0;
        allottedMinutes= 800;
        minutesUsed = 800;
        baseCost = 79.9;
    }
    public PhoneBill(int id){
        this.id = id;
        allottedMinutes = 800;
        minutesUsed = 800;
        baseCost = 79.9;
    }

    public PhoneBill(int id, int allottedMinutes, int minutesUsed, double baseCost){
        this.baseCost = baseCost;
        this.id = id;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    public double calculateOverage(){
        if (minutesUsed <= allottedMinutes)
            return 0;
        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageRate * overageMinutes;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }
    public double calculateTotal(){
        return baseCost + calculateTax() + calculateOverage();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.printf("Overage Fee: $%.2f%n", calculateOverage());
        System.out.printf("Tax: $%.2f%n", calculateTax());
        System.out.printf("Total: $%.2f%n", calculateTotal());

    }

}

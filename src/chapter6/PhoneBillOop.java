package chapter6;

public class PhoneBillOop {

    public static void main(String args[]){
        // call the method PhoneBill and pass to it the id , minutes used , allotted minutes, base cost //
        PhoneBill phoneBill = new PhoneBill(1,800,800,50.9);
        phoneBill.printItemizedBill();



    }
}

package org.example;

interface Payment {
    //Default method does not force to override
    default void addCoupan() {
        System.out.println("add 5 Rupees cashback");
    }

    //Common features if we want to provide among all services
    public static String generateTransaction() {
        return  "Tax Report Generated";
    }
}
public class GPay implements Payment {

    public static void main(String[] args) {
        Payment payment = new GPay();
        payment.addCoupan();
        System.out.println(Payment.generateTransaction());
    }
}

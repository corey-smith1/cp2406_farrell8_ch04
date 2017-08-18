public class Billing {


    public static void main(String[] args) {

        computeBill(100);
        computeBill(100,2);
        computeBill(100,2, 0.25f);
    }

    public static void computeBill(double price) {
        double tax = 0.08;
        double total_cost = price + price*tax;
        System.out.println(total_cost);
    }

    public static void computeBill(double price, int quantity) {
        double tax = 0.08;
        double orderPrice = price*quantity;
        double total_cost = orderPrice + price*tax;
        System.out.println(total_cost);
    }

    public static void computeBill(double price, int quantity, float coupon) {
        double tax = 0.08;
        double orderPrice = price*quantity;
        double orderpricecoupon = orderPrice - orderPrice*coupon;
        double total_cost = orderpricecoupon + price*tax;
        System.out.println(total_cost);
    }


}

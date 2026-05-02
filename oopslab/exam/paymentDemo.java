
public class PaymentDemo {
    public static void main(String[] args) {

        paypal pp = new paypal();
        pp.validation();
        pp.refund();
        pp.log();

        System.out.println();

        credit cc = new credit();
        cc.validation();
        cc.refund();
        cc.notif();
    }
}

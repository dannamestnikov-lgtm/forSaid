package SystemOfBank;

public class main {
    public static void main(String[] args) {

    cardpayment p1 = new cardpayment(3200, Currency.RUB, true, 4000, "sber", 432);
    p1.printTransactionInfo();
//    p1.validate();
//    cryptopayment c1 = new cryptopayment(115, Currency.USD, "bybit", 231);
//    c1.validate();
//    cryptopayment c2 = new cryptopayment(1600, Currency.RUB, "tbank", 143);
//    c2.validate();
    }
}

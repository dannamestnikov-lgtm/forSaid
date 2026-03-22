package day01.util;

public class CurrencyConverter {
    double rub;
    public static final double EUR_RATE = 100;
    public static double rubToEur (double rub){
         return rub / EUR_RATE;
    }
}

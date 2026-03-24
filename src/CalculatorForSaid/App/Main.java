package CalculatorForSaid.App;

import CalculatorForSaid.Service.Calculator;
import CalculatorForSaid.Service.Converter;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Calculator cal = new Calculator();
       int num1 = 11;
       int num2 = 4;
       int result1 = cal.plus(num1, num2);
       Converter con = new Converter();
       String a = con.convertNum(num1);
       String b = con.convertNum(num2);
       String r1 = con.convertNum(result1);
       String plus = con.convertZnk("+");
       String ravno = con.convertZnk("=");
       System.out.println(a + " " + plus + " " + b + " " + ravno + " " + r1);
       int num3 = 14;
       int num4 = 11;
       int result2 = cal.minus(num3, num4);
       String c = con.convertNum(num3);
       String d = con.convertNum(num4);
       String minus = con.convertZnk("-");
       String r2 = con.convertNum(result2);
       System.out.println(c + " " + minus + " " + d + " " + ravno + " " + r2);
    }
}

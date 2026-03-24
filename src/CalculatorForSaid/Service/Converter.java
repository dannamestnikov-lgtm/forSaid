package CalculatorForSaid.Service;

public class Converter {
    private static final String[] num_text = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};
    public String convertNum(int num){
        if (num > 0 && num < 20){
           return num_text[num];
        } else {
            return "неизвестно";
        }
    }

    public String convertZnk(String operation){
        switch (operation){
            case "+":
                return "плюс";
            case "=":
                return "равно";
            case "-":
                return "минус";
            default:
                return "неизвестно";
        }
    }
}

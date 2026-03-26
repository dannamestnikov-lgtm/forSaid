package CalculatorForSaid.Service;

public class Converter {
    private static final String[] units = {
            "", "один", "два", "три", "четыре", "пять",
            "шесть", "семь", "восемь", "девять", "десять",
            "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };

    private static final String[] tens = {
            "", "", "двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
    };

    private static final String[] hundreds = {
            "", "сто", "двести", "триста", "четыреста", "пятьсот",
            "шестьсот", "семьсот", "восемьсот", "девятьсот"
    };

    private static final String[] bigUnits = {
            "", "тысяча", "миллион"
    };

    public String convertNum(int num){
        if (num == 0){
            return "ноль";
        }
        String text = " ";

        if (num >= 1000000){
            int millions = num / 1000000;
            text += convertNum(millions) + " " + getform(millions, "миллион", "миллиона", "миллионов") + " ";
            num %= 1000000;
        }

        if (num >= 1000) {
            int thousands = num / 1000;
            if (thousands == 1) {
                text += " одна " + getform(thousands, "тысяча", "тысячи", "тысяч") + " ";
            } else if (thousands == 2) {
                text += " две " + getform(thousands, "тысяча", "тысячи", "тысяч") + " ";
            } else {
                text += convertNum(thousands) + " " + getform(thousands, "тысяча", "тысячи", "тысяч") + " ";
            }
            num %= 1000;
        }

        int h = num / 100;
        text += hundreds[h] + " ";

        int rem = num % 100;
        if (rem < 20){
            text += units[rem];
        } else {
            int t = rem / 10;
            int u = rem % 10;
            text += tens[t] + " " + units[u];
        }
        return text.trim();
    }

    public String convertZnak(String operation){
        switch (operation) {
            case "+":
                return "плюс";
            case "-":
                return "минус";
            case "*":
                return "умножение";
            case "/":
                return "деление";
            case "=":
                return "равно";
            default:
                return "неизвестная операция";
        }
    }

    public static String printOperationText(Calculator cal, Converter con, int num1, int num2, String operation) {
        int result = 0;
        switch (operation){
            case "+":
                result = cal.plus(num1, num2);
                break;
            case "-":
                result = cal.minus(num1, num2);
                break;
            case "*":
                result = cal.ymnozh(num1, num2);
                break;
            case "/":
                result = cal.delenie(num1, num2);
                break;
            default:
                System.out.println("неизвестная операция");
                break;
        }
        return con.convertNum(num1) + " " + con.convertZnak(operation) + " " + con.convertNum(num2) + " " + con.convertZnak("=") + " " + con.convertNum(result);
    }

    private String getform(int num, String one, String two, String five){
        int n = num % 100;
        if (n >= 11 && n <= 19){
            return five;
        }
        int last = n % 10;
        if (last == 1) return one;
        if (last >= 2 && last <= 4) return two;
        return five;
    }
}

package SystemOfBank;

public class cryptopayment extends payment{
    public cryptopayment(int amount, Currency currency, String bankName, int transactionId) {
        super(amount, currency, bankName, transactionId);
    }
    @Override
    public void validate (){
        if (getCurrency() != Currency.USD){
            System.out.println("Ошибка. Для переводов по криптоввалюте доступна только валюта USD");
            return;
        }
        if (getAmount() < 100){
            System.out.println("Ошибка. Сумма перевода не может быть меньше 100 USD");
            return;
        }
        System.out.println("Операция успешно обработана. Баланс пополнен на " + getAmount());
    }
    }


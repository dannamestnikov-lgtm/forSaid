package SystemOfBank;

public abstract class payment {
    private int amount;
    private Currency currency;
    private TransactionInfo info;
    protected int getAmount(){
        return amount;
    }
    protected Currency getCurrency(){
        return currency;
    }

    public payment(int amount, Currency currency, String bankName, int transactionId) {
        if (amount > 10) {
            this.amount = amount;
            System.out.println("Введённая сумма: " + this.amount);
        } else {
            System.out.println("слишком маленькая сумма");
            return;
        }
        this.currency = currency;
        System.out.println("Выбранная валюта: " + this.currency);;
        this.info = new TransactionInfo(bankName, transactionId);
    }
    public void printInfo(){
        System.out.println("Сумма перевода: " + this.amount + "\nВалюта: " + this.currency);
    }
    public void printTransactionInfo (){
        info.print();
    }
    public abstract void validate();

    class TransactionInfo{
        String bankName;
        int transactionId;
        public TransactionInfo(String bankName, int transactionId){
            this.bankName = bankName;
            this.transactionId = transactionId;
        }
        public void print (){
            System.out.println("Наименование банка: " + bankName + "\nНомер транзакции: " + transactionId);
        }
    }
    }



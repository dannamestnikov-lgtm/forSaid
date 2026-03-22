package SystemOfBank;

public class cardpayment extends payment {
    private boolean limit;
    private int numlimit;
    private String bankName;
    private int transactionId;

    public cardpayment(int amount, Currency currency, boolean limit, int numlimit, String bankName, int transactionId) {
        super(amount, currency, bankName, transactionId);
        this.limit = limit;
        this.numlimit = numlimit;
    }
    @Override
    public void validate() {
        if (getAmount() > 5000) {
            System.out.println("Вы не можете переводить больше 5000 рублей. Ваш счет заблокирован");
        return;
        }
        if (!limit) {
            System.out.println("На вашей карте нет лимита");
            System.out.println("Перевод успешно совершен");
            return;
        }
            System.out.println("Спешим вам напомнить, что на вашей карте установлен лимит на " + numlimit);

            if (getAmount() > numlimit) {
                System.out.println("Ошибка: сумма перевода превышает лимит карты");
                return;
            }
        System.out.println("перевод успешно совершен");
        }

    }

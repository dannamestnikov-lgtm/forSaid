package oop;

import java.util.ArrayList;

public class BankSystem {
    ArrayList<account> accounts;
    ArrayList<Transaction> transactions;

    account FindAccount(int id) {
        for (account a : accounts) {
            if (a.id == id) {
                return a;
            }
        }
        return null;
    }
}

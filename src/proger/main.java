package proger;

import proger.db.DB;

public class main {
    public static void main(String[] args) {
        car bmw = new car();

        bmw.setLight(true);
        bmw.blinkLight();
    }
}
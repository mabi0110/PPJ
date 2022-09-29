package cw13.zadanie2;

import cw11.NotEnoughFuelException;

public class DebetCard {

    private double dailyDebetCounter = 0;

    public double getDailyDebetCounter() {
        return dailyDebetCounter;
    }

    public void setDailyDebetCounter(double dailyDebetCounter) {
        this.dailyDebetCounter = dailyDebetCounter;
    }

    public void wyplac(Account account, double money) throws NotEnoughFoundsException {
        dailyDebetCounter += money;

        if (money > account.getBalance()){
            throw new NotEnoughFoundsException("Nie możesz wypłacić " + money + " zł. Na koncie masz " + account.getBalance() + " zł");
        }

        if (dailyDebetCounter > account.getDailyDebet()){
            throw new NotEnoughFoundsException(
                    "Nie możesz wypłacić " + money
                            + " zł, przekroczysz dzienny debet o " + (dailyDebetCounter - account.getDailyDebet())
                            + " zł. Możesz wypłacić: " + (account.getDailyDebet() - (dailyDebetCounter - money)) + " zł");
        }


        account.setBalance(account.getBalance() - money);
    }
}

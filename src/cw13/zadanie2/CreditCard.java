package cw13.zadanie2;

public class CreditCard {


    private double creditCounter = 0;


    public void wyplac(Account account, double money) throws NotEnoughFoundsException {
        creditCounter += money;

        if (creditCounter > account.getCredit()){
            throw new NotEnoughFoundsException(
                    "Nie możesz wypłacić z karty kredytowej " + money
                            + " zł, przekroczysz kredyt o " + (creditCounter - account.getCredit())
                            + " zł. Możesz wypłacić: " + (account.getCredit() - (creditCounter - money)) + " zł");
        }

    }
}

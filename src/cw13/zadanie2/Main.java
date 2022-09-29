package cw13.zadanie2;


public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        DebetCard debetCard = new DebetCard();
        Account account = new Account(12000, 1000, 10000, debetCard, creditCard);

        try {
            debetCard.wyplac(account, 800);
            debetCard.wyplac(account, 750);
//            debetCard.wyplac(account, 300);
            creditCard.wyplac(account, 9000);
            creditCard.wyplac(account, 5000);
        } catch (NotEnoughFoundsException e) {
            System.err.println(e.getMessage());;
        }


    }
}

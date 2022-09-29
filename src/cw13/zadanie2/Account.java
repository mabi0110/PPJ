package cw13.zadanie2;


public class Account {
    private double balance;
    private double dailyDebet;
    private double credit;
    DebetCard debetCard;
    CreditCard creditCard;


    public Account(double balance, double dailyDebet, double credit,
                   DebetCard debetCard, CreditCard creditCard) {
        this.balance = balance;
        this.dailyDebet = dailyDebet;
        this.credit = credit;
        this.debetCard = debetCard;
        this.creditCard = creditCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDailyDebet() {
        return dailyDebet;
    }

    public void setDailyDebet(double dailyDebet) {
        this.dailyDebet = dailyDebet;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

}

package cw11;

public class Rakieta {
    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        System.out.println("Waga paliwa przed tankowaniem: " + wagaPaliwa);
        wagaPaliwa += (double) ((Math.random() * (1000 - 200)) + 200);
        System.out.println("Waga paliwa po tankowaniu: " + wagaPaliwa);

    }

    public void start() throws NotEnoughFuelException {
        if (wagaPaliwa < 1000){
            throw new NotEnoughFuelException("Start anulowany - za mało paliwa!");
        } else {
            System.out.println("Rakieta " + nazwa + " wystartowała!");
        }
    }

    @Override
    public String toString() {
        return nazwa + " " + wagaPaliwa + "kg paliwa";
    }
}

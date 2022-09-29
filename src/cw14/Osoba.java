package cw14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Osoba {
    private String firstName;
    private String lastName;
    private int birthYear;
    private char gender;
    private short postalCode;

    public Osoba() throws NiewlasciweDaneException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Pattern pattern = Pattern.compile("[A-Z][a-z]+");

            System.out.print("Podaj imię: ");
            String firstName = reader.readLine();
            if (!pattern.matcher(firstName).matches()){
                throw new NiewlasciweDaneException("Podałeś niepoprawne imie");
            } else {
                this.firstName = firstName;
            }

            System.out.print("Podaj nazwisko: ");
            String lastName = reader.readLine();
            if (!pattern.matcher(lastName).matches()){
                throw new NiewlasciweDaneException("Podałeś niepoprawne nazwisko");
            } else {
                this.lastName = lastName;
            }

            pattern = Pattern.compile("[1-2]{1}[0-9]{3}");
            System.out.print("Podaj rok urodzenia: ");
            String birthYear = reader.readLine();
            if (!pattern.matcher(String.valueOf(birthYear)).matches()){
                throw new NiewlasciweDaneException("Podałeś niepoprawny rok urodzenia");
            } else {
                this.birthYear = Integer.parseInt(birthYear);
            }

            pattern = Pattern.compile("[K]{1}|[M]{1}");
            System.out.print("Podaj płeć (K/M): ");
            String gender = reader.readLine();
            if (!pattern.matcher(String.valueOf(gender)).matches()){
                throw new NiewlasciweDaneException("Podałeś niepoprawną płeć");
            } else {
                this.gender = String.valueOf(gender).charAt(0);
            }

            pattern = Pattern.compile("[0-9]{5}");
            System.out.print("Podaj kod pocztowy: ");
            String postalCode = reader.readLine();
            if (!pattern.matcher(String.valueOf(postalCode)).matches()){
                throw new NiewlasciweDaneException("Podałeś niepoprawny kod pocztowy");
            } else {
                this.postalCode = Short.parseShort(postalCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Imię: " + firstName +
                ", nazwisko: " + lastName +
                ", rok urodzenia: " + birthYear +
                ", płeć: " + gender +
                ", kod pocztowy: " + postalCode;
    }
}

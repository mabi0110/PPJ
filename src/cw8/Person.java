package cw8;

public class Person {
    public String name;
    public String surname;
    public int bDay;

    public Person(){
    }
    public Person(String name, String surname, int bDay) {
        this.name = name;
        this.surname = surname;
        this.bDay = bDay;
    }

    public void show(){
        System.out.println("Dane: \n imie: " + name + "\n nazwisko: " + surname + "\n dzien urodzenia: " +bDay);
    }


}

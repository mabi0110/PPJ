package cw9;

import java.time.LocalDateTime;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return LocalDateTime.now().getYear() - birthYear;
    }

    public static Person getOlder(Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
            return p1;
        }
        return p2;
    }

    public static Person getOldest(Person[] peopleArr){
        if (peopleArr.length == 0){
            return null;
        } else {
            Person oldestPerson = peopleArr[0];

            for (int i = 1; i < peopleArr.length ; i++) {
                oldestPerson = getOlder(oldestPerson, peopleArr[i]);
            }
            return oldestPerson;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

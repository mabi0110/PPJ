package cw9;

public class Main {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
        zadanie3();

    }

    private static void zadanie3() {
        Donkey donkey = new Donkey(0.1);
        while (!donkey.isFlying()){
            Balloon balloon = new Balloon();
            donkey.addBalloon(balloon);
        }
        System.out.println("Ja latam!!!");
    }

    private static void zadanie2() {
        Person person1 = new Person("Jan", 1993);
        Person person2 = new Person("Adam");
        Person person3 = new Person("Ania", 1988);
        Person person4 = new Person("Hania", 1933);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        System.out.println(Person.getOlder(person1, person2));

        Person[] peopleArr = new Person[]{person1, person2, person3, person4};
        System.out.println(Person.getOldest(peopleArr));

        System.out.println("SORTOWANIE");

        for (int i = 0; i < peopleArr.length; i++) {
            for (int j = i + 1; j < peopleArr.length; j++) {
                if (peopleArr[i].getAge() > peopleArr[j].getAge()){
                    Person tmp = peopleArr[i];
                    peopleArr[i] = peopleArr[j];
                    peopleArr[j] = tmp;
                }
            }
        }

        for (Person person: peopleArr) {
            System.out.println(person);
        }
    }

    private static void zadanie1() {
        Corn corn = new Corn(100);
        System.out.println(corn.makePopcorn().length);
    }
}

package cw8;

public class Cwiczenia8 {
    public static void main(String[] args) {
        MethodCurrier methodCurrier = new MethodCurrier();
        methodCurrier.setValue(5);
        methodCurrier.setValue(5.0F);
        methodCurrier.setValue('a');
        methodCurrier.setValue((byte) 4);

        Number number = new Number();
        number.setValue(5);
        methodCurrier.setValue(number);

        Person person1 = new Person();
        person1.name = "Jan";
        person1.surname = "Kowalski";
        person1.bDay = 15;

        Person person2 = new Person("Adam", "Nowak", 12);
        person1.show();
        person2.show();

        Cplx cplx1 = new Cplx(5,2);
        Cplx cplx2 = new Cplx(3,-7);
        Cplx cplx3 = new Cplx(6,6);

        cplx1.show();
        cplx2.show();
        cplx3.show();

        cplx1.mul(cplx2);
        cplx1.show();

        cplx1.incRe();
        cplx1.show();

        cplx1.add(cplx2);
        cplx1.show();

        cplx1.sub(cplx3);
        cplx1.show();


    }
}

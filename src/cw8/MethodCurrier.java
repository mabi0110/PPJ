package cw8;

public class MethodCurrier {

    private final int modifier = 10;

    void setValue(int number){
        System.out.println("Int przed: " + number);
        number *= modifier;
        System.out.println("Int po: " + number);
    }

    void setValue(float number){
        System.out.println("Float przed: " + number);
        number *= modifier;
        System.out.println("Float po: " + number);
    }

    void setValue(Number n){
        System.out.print("Number przed: ");
        n.showValue();
        n.number *= modifier;
        System.out.print("Number po: ");
        n.showValue();
    }

}

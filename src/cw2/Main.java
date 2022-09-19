package cw2;

public class Main {
    public static void main(String[] args) {
//        zadanie1();
//        zadanie2();
//        zadanie3();
//        zadanie4();
        zadanie5();
    }

    private static void zadanie5() {
        System.out.println("Zadanie V");
        int var = 0b0111;
        int var1a = 0b0011;
        int var1b = 0b1100;
        printResultAndOr(var, var1a, var1b);

        int var2a = 0b1000;
        int var2b = 0b0100;
        printResultAndOr(var, var2a, var2b);

        int var3a = 0b1001;
        int var3b = 0b0010;
        printResultAndOr(var, var3a, var3b);

        int var4a = 0b0010;
        int var4b = 0b1001;
        printResultAndOr(var, var4a, var4b);

        int var5a = 0b0001;
        int var5b = 0b1000;
        printResultAndOr(var, var5a, var5b);
    }

    private static void printResultAndOr(int var1, int var1a, int var1b) {
        System.out.print(var1 + " & " + var1a + " | " + var1b + " = ");
        System.out.print(var1 & var1a | var1b);
        System.out.println();
    }

    private static void printResultOrAnd(int var1, int var1a, int var1b) {
        System.out.print(var1 + " | " + var1a + " & " + var1b + " = ");
        System.out.print(var1 | var1a & var1b);
        System.out.println();
    }

    private static void zadanie4() {
        System.out.println("Zadanie IV");
        int var = 0b0101;
        int var1a = 0b1011;
        int var1b = 0b1001;
        int var1c = 0b0011;
        int var1d = 0b0001;

        printResultAnd(var, var1a);
        printResultAnd(var, var1b);
        printResultAnd(var, var1c);
        printResultAnd(var, var1d);

        int var2a = 0b0100;
        int var2b = 0b0110;
        int var2c = 0b1100;
        int var2d = 0b1110;

        printResultAnd(var, var2a);
        printResultAnd(var, var2b);
        printResultAnd(var, var2c);
        printResultAnd(var, var2d);

        int var3a = 0b1111;
        int var3b = 0b1101;
        int var3c = 0b0111;
        int var3d = 0b0101;

        printResultAnd(var, var3a);
        printResultAnd(var, var3b);
        printResultAnd(var, var3c);
        printResultAnd(var, var3d);

        int var4a = 0b0000;
        int var4b = 0b0010;
        int var4c = 0b1000;
        int var4d = 0b1010;

        printResultAnd(var, var4a);
        printResultAnd(var, var4b);
        printResultAnd(var, var4c);
        printResultAnd(var, var4d);

    }

    private static void printResultAnd(int var1, int var2) {
        System.out.print(var1 + " & " + var2 + " = ");
        System.out.print(var1 & var2);
        System.out.println();
    }

    private static void zadanie3() {
        System.out.println("Zadanie III");
        System.out.print(0b0100 + " | " + 0b0001 + " = ");
        System.out.print(0b0100 | 0b0001);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b0101 + " = ");
        System.out.print(0b0100 | 0b0101);
        System.out.println();

        System.out.print(0b0100 + " | " + 0b0010 + " = ");
        System.out.print(0b0100 | 0b0010);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b0110 + " = ");
        System.out.print(0b0100 | 0b0110);
        System.out.println();

        System.out.print(0b0100 + " | " + 0b0011 + " = ");
        System.out.print(0b0100 | 0b0011);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b0111 + " = ");
        System.out.print(0b0100 | 0b0111);
        System.out.println();

        System.out.print(0b0100 + " | " + 0b1100 + " = ");
        System.out.print(0b0100 | 0b1100);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b1000 + " = ");
        System.out.print(0b0100 | 0b1000);
        System.out.println();

        System.out.print(0b0100 + " | " + 0b0100 + " = ");
        System.out.print(0b0100 | 0b0100);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b0000 + " = ");
        System.out.print(0b0100 | 0b0000);
        System.out.println();

        System.out.print(0b0100 + " | " + 0b01101 + " = ");
        System.out.print(0b0100 | 0b1101);
        System.out.println();
        System.out.print(0b0100 + " | " + 0b1001 + " = ");
        System.out.print(0b0100 | 0b1001);
        System.out.println();

    }

    private static void zadanie2() {
        System.out.println("Zadanie II");
        System.out.print(0b0111 + " & " + 0b0010 + " = ");
        System.out.print(0b0111 & 0b0010);
        System.out.println();

        System.out.print(0b11110 + " | " + 0b1010 + " = ");
        System.out.print(0b11110 | 0b1010);
        System.out.println();

        System.out.print(0b0111 + " ^ " + 0b0010 + " = ");
        System.out.print(0b0111 ^ 0b0010);
        System.out.println();

        System.out.print(0b1011 + " & " + 0b1000 + " = ");
        System.out.print(0b1011 & 0b1000);
        System.out.println();

        System.out.print(0b11010 + " >> " + 2 + " = ");
        System.out.print(0b11010 >> 2);
        System.out.println();

        System.out.print(0b100100 + " << " + 3 + " = ");
        System.out.print(0b100100 << 3);
        System.out.println();

        System.out.print(0b100111 + " & " + 0b1101 + " = ");
        System.out.print(0b100111 & 0b1101);
        System.out.println();

        System.out.print(0b1100 + " | " + 0b10010 + " = ");
        System.out.print(0b1100 | 0b10010);
        System.out.println();

        System.out.print(0b101000 + " >> " + 4 + " = ");
        System.out.print(0b101000 >> 4);
        System.out.println();

        System.out.print(0b11011 + " ^ " + 0b10000 + " = ");
        System.out.print(0b11011 ^ 0b10000);
        System.out.println();
    }

    private static void zadanie1() {
        System.out.println("Zadanie I");
        System.out.println(0b10111 & 0b1111);
        System.out.println(0b10111 | 0b1111);
        System.out.println(0b10111 ^ 0b1111);
    }
}

package cw13.zadanie3;

public class SecretFile extends File{


    public SecretFile(String name, int pages, String text) {
        super(name, pages, text);
    }

    @Override
    public void show() {
        for (int i = 0; i < getWords().length; i++) {
            if (i % 2 == 0){
                System.out.print(getWords()[i] + " ");
            } else {
                for (int j = 0; j < getWords()[i].length(); j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
        }
    }
}

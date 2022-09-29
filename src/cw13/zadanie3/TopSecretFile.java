package cw13.zadanie3;

public class TopSecretFile extends File{

    public TopSecretFile(String name, int pages, String text) {
        super(name, pages, text);
    }

    @Override
    public void show() {
        for (int i = 0; i < getWords().length; i++) {
            if (i % 5 == 0){
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

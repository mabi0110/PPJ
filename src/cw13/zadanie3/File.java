package cw13.zadanie3;

public class File {

    private String name;
    private int pages;
    private String text;
    private String[] words;


    public File(String name, int pages, String text) {
        this.name = name;
        this.pages = pages;
        this.text = text;
        words = text.split(" ");
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public void show(){
        System.out.print(text);
    }
}

package cw10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Word {
    private char[] characters;
    private int numberOfCharacters;

    public Word() {
        characters = new char[100];
        numberOfCharacters = 0;
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public void setNumberOfCharacters(int numberOfCharacters) {
        this.numberOfCharacters = numberOfCharacters;
    }

    public void addChar(char character){
        characters[numberOfCharacters] = character;
        numberOfCharacters++;
    }

    public void show(){
        char[] temp = new char[numberOfCharacters];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = characters[i];
        }

        characters = temp;

        System.out.println(Arrays.toString(characters));
    }

    public int length(){
        return numberOfCharacters;
    }
}

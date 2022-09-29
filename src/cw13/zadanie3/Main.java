package cw13.zadanie3;


import java.util.Random;

public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            File file = createFile();
            assert file != null;
            file.show();
            System.out.println();
        }
    }

    private static File createFile() {
        File file1 = new File("Joe Biden", 400, "Joe Biden, właśc. Joseph Robinette Biden Jr., wym. [ˈʤoʊsɨf rɒbɨˈnɛt ˈbaɪdən] (ur. 20 listopada 1942 w Scranton) – amerykański polityk, 46. prezydent Stanów Zjednoczonych, w latach 1973–2009 senator ze stanu Delaware, w latach 2009–2017 wiceprezydent Stanów Zjednoczonych.");
        File file2 = new TopSecretFile("Joe Biden", 400, "Joe Biden, właśc. Joseph Robinette Biden Jr., wym. [ˈʤoʊsɨf rɒbɨˈnɛt ˈbaɪdən] (ur. 20 listopada 1942 w Scranton) – amerykański polityk, 46. prezydent Stanów Zjednoczonych, w latach 1973–2009 senator ze stanu Delaware, w latach 2009–2017 wiceprezydent Stanów Zjednoczonych.");
        File file3 = new SecretFile("Joe Biden", 400, "Joe Biden, właśc. Joseph Robinette Biden Jr., wym. [ˈʤoʊsɨf rɒbɨˈnɛt ˈbaɪdən] (ur. 20 listopada 1942 w Scranton) – amerykański polityk, 46. prezydent Stanów Zjednoczonych, w latach 1973–2009 senator ze stanu Delaware, w latach 2009–2017 wiceprezydent Stanów Zjednoczonych.");
        Random random = new Random();
        int option = random.nextInt(3);
        switch (option) {
            case 0 -> {
                return file1;
            }
            case 1 -> {
                return file2;
            }
            case 2 -> {
                return file3;
            }
        }
        return null;
    }

}

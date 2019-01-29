package cezar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Patryk Duduœ›
 */
public class Cezar {

    static Scanner in = new Scanner(System.in);
    static String word;
    static int key;
    static String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuWwYyZz?!";

    public static void main(String[] args) {
        System.out.println("Podaj zdanie do zakodowania: ");
        word = GetWord();

        System.out.println("Podaj klucz: ");
        key = GetKey() % 26;

        System.out.println("Tekst po zakodowaniu: ");
        System.out.println(CodeWord(word, key));

        System.out.println("Tekst po odkodowaniu: ");
        System.out.println(DecodeWord(word, key));
        
        System.out.println(alphabet.length());
    }

    /*
    
     */
    public static String GetWord() {
        do {
            word = in.nextLine();
            if (word.matches("[A-Za-z!?\\s]{1,}")) {
                break;
            }
        } while (true);

        return word;

    }

    /*
    
     */
    public static int GetKey() {
        key = 0;
        try {
            key = in.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("To nie jest integer");
        }
        return key;
    }

    /*
    
     */
    public static String CodeWord(String word, int key) {
        String code = "";
        int j = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                code += " ";
            } else {
                while (word.charAt(i) != alphabet.charAt(j)) {
                    j++;
                }
                int keyWord = word.charAt(i) + key;

                if (keyWord > 'Z') {
                    keyWord -= 26;
                }
                if (keyWord < 'A') {
                    keyWord += 26;
                }

                code += (char) keyWord;
            }
        }

        return code;
    }

    /*
    
     */
    public static String DecodeWord(String word, int key) {
        String decode = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                decode += " ";
            } else {
                int keyWord = word.charAt(i) - key;

                if (keyWord > 'Z') {
                    keyWord -= 26;
                }
                if (keyWord < 'A') {
                    keyWord += 26;
                }
                decode += (char) keyWord;
            }
        }
        return decode;
    }


    /*
    
     */
    public static String codeWord(String word, int key) {
        String code = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                code += " ";
            } else {
                for (int j = 0; j < alphabet.length(); j++) {
                    if (word.charAt(i) == alphabet.charAt(j)) {
                        j += key;
                        if (j > alphabet.length()) {

                            code += alphabet.charAt(j + key);

                        }
                    }
                }
            }
        }

        return code;
    }
    /*
    
     */
}

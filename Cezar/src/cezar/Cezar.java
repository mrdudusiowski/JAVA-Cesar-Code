package cezar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Patryk Duduś›
 */


public class Cezar {

    static Scanner in = new Scanner(System.in);
    static String word;
    static int key;
    static String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpRrSsTtUuWwYyZz?! ";

    public static void main(String[] args) {
        System.out.println("Podaj zdanie do zakodowania: ");
        word = getWord();

        System.out.println("Podaj klucz: ");
        key = getKey() % alphabet.length();

        //  System.out.println("Tekst po zakodowaniu: ");
        //  System.out.println(CodeWord(word, key));
        // System.out.println("Tekst po odkodowaniu: ");
        //  System.out.println(DecodeWord(word, key));
        System.out.println(codeWord(word, key));

        //
        Cipher test = new Cipher(Alphabet.Normal,2);
     //   test.setKey(2);
        System.out.println(test.encrypt("abc"));
        System.out.println(test.decrypt("bcd"));
    }

    /*
    
     */
    public static String getWord() {
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
    public static int getKey() {
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
    public static String codeWord2(String word, int key) {
        String code = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                code += " ";
            } else {
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
    public static String decodeWord2(String word, int key) {
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
    public static StringBuilder codeWord(String word, int key) {
        StringBuilder s = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabetLength; j++) {
                if (word.charAt(i) == alphabet.charAt(j)) {
                    j = (j + key + alphabetLength) % alphabetLength;
                    s.append(alphabet.charAt(j));
                    break;
                }
            }
        }

        return s;
    }
    /*
    
     */
}

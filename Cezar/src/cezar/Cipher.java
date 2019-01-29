package cezar;

public class Cipher {

    private String alphabet;
    private CharProc cp;

    public Cipher(CharProc ch) {
        this.cp=ch;    
    }
/*
    public void setKey(int offset) {
        this.offset = offset;
    }
*/
    public String encrypt(String word) {
        return process(word);
    }
/*
    public StringBuilder decrypt(String word) {
      //  return process(word);
    }
*/
    
    public String process(String word) {
        StringBuilder s = new StringBuilder();
//        int alphabetLength = alphabet.length();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = cp.process(ch);
            s.append(ch);
        }

        return s.toString();

    }
}


/*
Początkowa wersja programu działająca na alfabecie i kluczu w int ( znajodowało się w for )
            char ch = word.charAt(i);
            int idx = alphabet.indexOf(ch);

            idx = (idx + offset + alphabetLength) % alphabetLength;
            ch = alphabet.charAt(idx);
            //s += ch; //wolnijesza metoda konkatenacji



*/
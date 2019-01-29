package cezar;

public class Cipher {

    private int key;
    private String alphabet;
    
    public Cipher(String alphabet, int key){
        this.alphabet=alphabet;
        this.key=key;
    }

    public void setKey(int key) {
        this.key = key;
        this.alphabet = alphabet;
    }

    public StringBuilder encrypt(String word) {
        StringBuilder s = new StringBuilder();
        int alphabetLength = alphabet.length();
        
        if(word.matches("["+alphabet+"]*")){
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j < alphabetLength; j++) {
                        if (word.charAt(i) == alphabet.charAt(j)) {
                            j = (j + key + alphabetLength) % alphabetLength;
                            s.append(alphabet.charAt(j));
                            break;
                        }
                    }
                }
        }
        else {
        System.out.println("Słowo nie zgodne z alfabetem");
        }
        return s;
    }

    public StringBuilder decrypt(String word) {
        StringBuilder s = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabetLength; j++) {
                if (word.charAt(i) == alphabet.charAt(j)) {
                    j = (j - key + alphabetLength) % alphabetLength;
                    s.append(alphabet.charAt(j));
                    break;
                }
            }
        }

        return s;
    }
}

package cezar;

public abstract class CharProc<T> {

    protected String alphabet;
    protected T key;

    CharProc(String alphabet, T key) {
        this.alphabet = alphabet;
        this.key = key;
    }

   public abstract char process(char c);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezar;

/**
 *
 * @author Student
 */
public class CesarCharProc extends CharProc<Integer> {

    public CesarCharProc(String alphabet, int key) {
        super(alphabet, key);
    }

    @Override
    public char process(char ch) {

        //pobierany indeks znaku w alfabecie
        int idx = alphabet.indexOf(ch);

        //przesuwamy w alfabecie o offset
        idx = (idx + key) % alphabet.length();

        //Odczytujemy znak z przesuniecia alfabetu
        return alphabet.charAt(idx);
    }

}

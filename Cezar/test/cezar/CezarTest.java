/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cezar;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class CezarTest {
    
    public CezarTest() {
    }

    /**
     * Test of main method, of class Cezar.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cezar.main(args);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWord method, of class Cezar.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        String expResult = "";
        String result = Cezar.getWord();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class Cezar.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        int expResult = 0;
        int result = Cezar.getKey();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of codeWord2 method, of class Cezar.
     */
    @Test
    public void testCodeWord2() {
        System.out.println("codeWord2");
        String word = "";
        int key = 0;
        String expResult = "";
        String result = Cezar.codeWord2(word, key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of decodeWord2 method, of class Cezar.
     */
    @Test
    public void testDecodeWord2() {
        System.out.println("decodeWord2");
        String word = "";
        int key = 0;
        String expResult = "";
        String result = Cezar.decodeWord2(word, key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of codeWord method, of class Cezar.
     */
    @Test
    public void testCodeWord() {
        System.out.println("codeWord");
        String word = "";
        int key = 0;
        StringBuilder expResult = null;
        StringBuilder result = Cezar.codeWord(word, key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

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
public class CipherTest {

    public CipherTest() {
    }

    /**
     * Test of setKey method, of class Cipher.
     */
    @Test
    public void testSetKey() {
       // assertEqual( , );
    }

    /**
     * Test of encrypt method, of class Cipher.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String word = "";
        Cipher instance = null;
        StringBuilder expResult = null;
        StringBuilder result = instance.encrypt(word);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class Cipher.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String word = "";
        Cipher instance = null;
        StringBuilder expResult = null;
        StringBuilder result = instance.decrypt(word);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}

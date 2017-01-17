/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        System.out.println("isChaineValide");
        String str = "bob";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIsChaineValideKO() {
        System.out.println("isChaineValide");
        String str = "s";
        StringUtils instance = new StringUtils();
        instance.isChaineValide(str);
    }
    
    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        String str = "abab";
        StringUtils instance = new StringUtils();

        String expResult = "baba";
        String result = instance.inverse(str);
        
        assertEquals(expResult, result);;
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeOK() {
        //given
        System.out.println("isPalindrome");
        String str = "BoB";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        
        //when
        boolean result = instance.isPalindrome(str);
        
        //then
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeNOK() {
        //given
        System.out.println("isPalindrome");
        String str = "Bol";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        
        //when
        boolean result = instance.isPalindrome(str);
        
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        //given
        System.out.println("compterOccurences");
        String str = "ababb";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put(String.valueOf('a'), 2);
        expResult.put(String.valueOf('b'), 3);
        
        //when
        Map<String, Integer> result = instance.compterOccurences(str);

        //then
        assertEquals(expResult, result);
    }
    
}
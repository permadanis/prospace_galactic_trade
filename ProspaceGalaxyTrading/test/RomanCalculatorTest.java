/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author YTR
 */
public class RomanCalculatorTest {
    
    public RomanCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of Validate method, of class RomanCalculator.
     */
    @Test
    public void testValidate() {
        System.out.println("Validate");
        String romanSymbol = "";
        boolean expResult = false;
        boolean result = RomanCalculator.IsValidRomanChar(romanSymbol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calculate method, of class RomanCalculator.
     */
    @Test
    public void testCalculate() {
        System.out.println("Calculate");
        String romanNumbers = "";
        int expResult = 0;
        int result = RomanCalculator.Calculate(romanNumbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

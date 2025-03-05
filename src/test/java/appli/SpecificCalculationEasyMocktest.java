/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author droch
 */
public class SpecificCalculationEasyMocktest {
    private ICalculator mock = null;

    private SpecificCalculation calc = null;
    
    public SpecificCalculationEasyMocktest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         mock = EasyMock.createMock(ICalculator.class);

         calc = new SpecificCalculation(){
            // ecriture classe dérivée de façon anonyme
            protected ICalculator creerCalculator(){
                return mock;
            }
        };
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void test1AvecEasyMock() {
        EasyMock.expect(mock.add(5, 10)).andReturn(15);
        //EasyMock.expect(mock.add(5, 11)).andReturn(16);
        EasyMock.expect(mock.substract(15, 8)).andReturn(7); //Integer.valueOf(7));
        EasyMock.replay(mock); 
        //int res1 = mock.add(5, 10);
        //int res1 = mock.substract(15, 8);
        int a=5, b=10, c=8, res;
        res = a + b - c;
        int result= calc.addsub(a, b, c);
        assertTrue("a négatif, b positif, c positif", result == res);
      //  EasyMock.verify(mock);
    }
}

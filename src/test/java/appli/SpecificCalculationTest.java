package appli;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpecificCalculationTest {

    @Test
    public void addsub() {
        SpecificCalculation calc = new SpecificCalculation();
        int a, b, c, res, resfinal;
        a = 10;
        b  = 5;
        c = 5;
        res = a + b;
        resfinal= res-c;
        assertTrue("addsub is done", calc.addsub(a, b, c) == resfinal);
    }



    @Test
    public void test1AvecMock() {
        // below code is using a class anonymn
       /* SpecificCalculation calc = new SpecificCalculation(){
            // ecriture classe dérivée de façon anonyme
            protected ICalculator creerCalculator(){
                return new MockCalculator();
            }
        };*/
        SpecificCalculation calc = new SpecificCalculationMock();
        int a=-5, b=10, c=10, res;
        res = a + b - c;
        assertTrue("a négatif, b positif, c positif", calc.addsub(a, b, c)
                == res);
    }
}
// IN java multiple class inside a single file is possible
class SpecificCalculationMock  extends SpecificCalculation {
    protected ICalculator creerCalculator(){
        return new MockCalculator();
    }
}
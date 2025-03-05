package appli;

public class SpecificCalculation {

   public int addsub(int a, int b, int c) {
        Calculator calculator = new Calculator();
        int res = calculator.add(a, b);
        int resfinal = calculator.substract(res, c);
        return resfinal;
    }

   // creating a new Mock (static) with the code below
    protected ICalculator creerCalculator(){
        return new Calculator();
    }

   /* public int addsub(int a, int b, int c) {
        ICalculator calculator =this.creerCalculator();
        int res = calculator.add(a, b);
        int resfinal = calculator.substract(res, b);
        return resfinal;
    }*/


}

package appli;

public class Calculator implements ICalculator{

    @Override
    public int multiply(int a, int b) {
        // a=2 b=3 a*b is 2*3 = 6 = 2+2+2 = 2++,2++,2++,2++
        int result = 0;
        boolean negative = false;

        if (b < 0) {
            negative = true;
            b = -b;
        }
        if(a<0){
            negative = true;
            a = -a;
        }

        for (int i = 0; i < b; i++) { //i=0, i=1, i=2
            int temp = a;//2 , 2 ,2
            while (temp-- > 0) {//2 1, 2 1, 2 1
                result++; // 1  2 , 3 4, 5 6
            }
        }

        // If b was negative, negate the result
        if (negative) {
            int temp = result; //6
            result = 0;
            while (temp-- > 0) {//6 5 4 3 2 1
                result--; //-1 -2 -3 -4 -5 -6
            }
        }
        return result;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        boolean negative = false;

        // Handle negatives: If either a or b is negative (but not both), the result is negative
        if (a < 0 && b > 0 || a > 0 && b < 0) {
            negative = true;
        }

        // Convert both to positive values
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        int result = 0;

        while (a >= b) { // a= 10 , 8 , 6 ,4 ,2
            int temp = b; //2, 2 ,2, 2,2
            while (temp-- > 0) { // 2 1,2 1,2 1,2 1,2 1
                a--; //9 8,7 6,5 4,3 2, 1 0
            }
            result++; //  1 2 3 4 5
        }

        // If the result should be negative, convert it
        if (negative) {
            int temp = result;
            result = 0;
            while (temp-- > 0) {
                result--;
            }
        }

        return result;
    }


    @Override
    public int add(int a, int b) {
        // eg a=5 b=3
        if(b>0){
            for (int i = 0; i < b ; i++) {
                a++;
            }
            return a;
        }else {
            int c= -b;
            for (int i = 0; i < c ; i++) {
                a--;
            }
            return a;
        }

    }

    @Override
    public int substract(int a, int b) { //15 and 20
        int result =a;
            for (int i = 0; i < Math.abs(b); i++) {
                if (b > 0) {
                    result--;
                } else {
                    result++;
                }
            }
            return result;
    }
}

package chap07.main;

import chap07.calculator.ExeTimeCalculator;
import chap07.calculator.ImpeCalculator;
import chap07.calculator.RecCalculator;

public class Main {
    public static void main(String[] args) {
        ImpeCalculator impeCalc = new ImpeCalculator();
        long start1 = System.currentTimeMillis();
        long fourFactorial1 = impeCalc.factorial(4);
        long end1 = System.currentTimeMillis();
        System.out.println("ImpeCalculator.factorial(4) 실행 시간 = " + (end1 - start1));

        RecCalculator recCalc = new RecCalculator();
        long start2 = System.currentTimeMillis();
        long fourFactorial2 = impeCalc.factorial(4);
        long end2 = System.currentTimeMillis();
        System.out.println("RecCalculator.factorial(4) 실행 시간 = " + (end2 - start2));

        ExeTimeCalculator calculator = new ExeTimeCalculator(impeCalc);
        long result = calculator.factorial(4);

    }
}

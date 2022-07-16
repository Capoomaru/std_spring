package chap07.main;

import chap07.calculator.ExeTimeCalculator;
import chap07.calculator.ImpeCalculator;
import chap07.calculator.RecCalculator;

public class MainProxy {

    public static void main(String[] args) {
        ExeTimeCalculator ttCalc1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println(ttCalc1.factorial(20));

        ExeTimeCalculator ttCalc2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println(ttCalc2.factorial(20));
    }
}

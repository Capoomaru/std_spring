package chap07.main;

import chap07.calculator.Calculator;
import chap07.calculator.RecCalculator;
import chap07.config.AppCtx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //Calculator calc = ctx.getBean("calculator", Calculator.class);
        RecCalculator calc = ctx.getBean("calculator", RecCalculator.class);
        long fiveFac = calc.factorial(5);
        System.out.println("cal.factorial(5) = " + fiveFac);
        System.out.println(calc.getClass().getName());
        ctx.close();
    }
}

package chap07.main;

import chap07.calculator.Calculator;
import chap07.config.AppCtxWithCache;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspectWithCache {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithCache.class);

        Calculator calc = ctx.getBean("calculator", Calculator.class);
        calc.factorial(7);
        calc.factorial(7);
        calc.factorial(5);
        calc.factorial(5);
    }
}

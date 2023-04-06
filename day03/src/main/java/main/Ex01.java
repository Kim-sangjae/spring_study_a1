package main;

import config.AppCtx;
import exam02.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator cal = ctx.getBean(Calculator.class);

        long result = cal.factorial(10);




        ctx.close();
    }
}

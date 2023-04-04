package exam01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {

        // 스프링 컨테이너에 담는다
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // getBean 으로 객체를 꺼내옴
        Hello hello = ctx.getBean("hello",Hello.class);
        hello.greet("이이름");


        Hello hello2 = ctx.getBean("hello", Hello.class);
        hello2.greet("이이름");


        System.out.println(hello == hello2); // 싱글톤 패턴으로 관리해준다 (동일한객체로 관리)

        ctx.close();


    }
}

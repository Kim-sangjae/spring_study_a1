package exam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message message = ctx.getBean(Message.class);
        message.send("메세지1");


        //아무것도 호출하지않아도 스프링 컨테이너가 만들어진 순간
        //afterPropertiesSet()
        //초기에 설정했던 메세지가 나온다

        ctx.close();
        // close() 메서드가 호출되지않으면 destroy() 가 실행되지않는다





    }

}

package exam2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[]args){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);


        Message message = ctx.getBean(Message.class);
        message.send("메세지지지지지");

        Message message1 = ctx.getBean(Message.class);
        message1.send("메세지??");



        System.out.println(message==message1); //true 싱글톤패턴




        ctx.close();



    }
}

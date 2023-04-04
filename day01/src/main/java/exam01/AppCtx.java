package exam01;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {


    @Bean // 스프링에게 관리할 객체라고 명시 (Bean 은 객체라고 보면된다)
    public Hello hello(){
        Hello hello = new Hello();
        return hello;
    }




}

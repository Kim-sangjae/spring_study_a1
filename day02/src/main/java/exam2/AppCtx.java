package exam2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {

    @Bean(initMethod = "init", destroyMethod = "close")
    //@Scope("prototype") // 매번 새 인스턴스로 만들어준다
    public Message message(){
        return new Message();
    }


}

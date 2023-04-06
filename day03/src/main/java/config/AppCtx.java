package config;

import exam02.Calculator;
import exam02.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtx {
    @Bean
    public Calculator calculator(){
        return new RecCalculator();
    }

    @Bean
    public CachedProxy cachedProxy(){
        return  new CachedProxy();
    }


    @Bean
    public CommonPointcut commonPointcut(){
        return  new CommonPointcut();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator2(){
        return new ProxyCalculator2();
    }



}

package config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class CommonPointcut {

//    많이쓰는 범위는 따로 빼서 사용해도 되다
    @Pointcut("execution(* exam02..*(..))") //공통기능을 적용할 범위
    public void publicTarget(){}
}

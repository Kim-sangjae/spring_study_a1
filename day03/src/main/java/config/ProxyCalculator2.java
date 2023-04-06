package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;


@Order(2)
@Aspect // 공통기능을 정리한 클래스이다
public class ProxyCalculator2 {
    /*
    @Pointcut("execution(* exam02..*(..))") //공통기능을 적용할 범위
    public void publicTarget(){}
    */


     @Around("config.CommonPointcut.publicTarget()") //공통기능 모든 자료형이 들어갈수있도록 Object // 정해져 있는 패턴이다 외워서써야함
    //@Around("execution(* exam02..*(..))") // 간단하게 쓸 때는 범위를 Around 에 바로 지정해도된다
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{

         long startTime = System.nanoTime();
         System.out.println("전");


        Object result = joinPoint.proceed(); // factorial 과 같은 핵심기능


         long endTime =System.nanoTime();
         System.out.println("후");


         System.out.printf("걸린시간 : %d\n",endTime-startTime);

        return result;

    }





}

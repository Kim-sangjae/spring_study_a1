package main;

import config.AppCtx;
import config.AppCtx2;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[]args){

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);


        //JoinService joinService = ctx.getBean("joinService",JoinService.class);
        JoinService joinService = ctx.getBean(JoinService.class);
        // 보통객체는 여러개 만들지않기때문에 클래스만 명시해줘도 무방하다

        ListService listService = ctx.getBean("listService",ListService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("1234567");
        member.setUserNm("사용자01");

        joinService.join(member); //회원가입

        listService.print(); // 멤버정보 출력



        ctx.close();








    }
}

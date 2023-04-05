package main;

import config.AppCtx;
import models.member.InfoService;
import models.member.JoinService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    public static void main(String[]agrs){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("1234567");
        member.setUserNm("사용자01");

        joinService.join(member);

        infoService.print(member.getUserId());


        ctx.close();
    }
}

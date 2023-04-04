package exam02;

import models.member.JoinService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);


        JoinService service = ctx.getBean("joinService",JoinService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("1234567");
        member.setUserNm("사용자01");


        service.join(member);


        ctx.close();






    }
}

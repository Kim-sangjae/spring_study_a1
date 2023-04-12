package controllers.members;

import lombok.Data;
import models.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class InfoController {
    @GetMapping("/member/info")
    public String info(Model model){
        Member member = new Member();
        member.setUserId("user01");
        member.setUserNm("사용자01");
        member.setMobile("010-1234-1234");
        member.setRegDt(LocalDateTime.now());
//        member.setIntro("<h1>자기소개!</h1>");

        model.addAttribute("member",member);
        return "member/info";
    }

}

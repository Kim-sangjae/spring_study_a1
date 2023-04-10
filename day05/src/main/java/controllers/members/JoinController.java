package controllers.members;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/join") // 공통적으로 /member로 매핑한다
public class JoinController {
    @GetMapping // 1) 공통매핑 + /join
                    // 2) 공통 매핑주소
    public String join(){

        return "member/join";
    }

    @PostMapping
    public String joinPs(Join join){ // getter setter로 받아올수 있는 클래스를 하나 만들어서 주입하면 짧게 쓸수있다
        System.out.println("POST로 유입됨");
        System.out.println(join);


        return "redirect:/member/login";

    }




}

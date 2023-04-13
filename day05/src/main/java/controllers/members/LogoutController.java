package controllers.members;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {
    @RequestMapping("/member/logout") // requestmapping - 공통적
    public String logout(HttpSession session){

        session.invalidate();

        return "redirect:/member/login";
    }

}

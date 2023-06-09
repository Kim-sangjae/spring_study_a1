package controllers.members;

import lombok.RequiredArgsConstructor;
import models.member.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/member/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginValidator validator;
    private final LoginService service;


    @GetMapping
    public String login(Model model, @CookieValue(required = false,name="saveId") String userId){

        Login login = new Login();
        if(userId != null){ // 쿠키값에 saveId가 있는경우
            login.setUserId(userId);
            login.setSaveId(true);
        }

        model.addAttribute("login",login);

        return "member/login";
    }

    @PostMapping
    public String loginPs(@Valid Login login, Errors errors){

        validator.validate(login,errors);

        if(errors.hasErrors()){
            return "member/login";
        }

        //로그인 처리
        service.login(login);



        return "redirect:/"; // 로그인성공시 메인페이지 이동
    }


}

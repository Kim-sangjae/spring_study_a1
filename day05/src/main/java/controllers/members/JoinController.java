package controllers.members;


import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/member/join") // 공통적으로 /member로 매핑한다
@RequiredArgsConstructor
public class JoinController {

    // final 또는 NonNull 을 붙여서 멤버변수 초기화 생성자로 주입시킨다
    private final JoinValidator validator;

    // 생성자로 벨리데이터 받아옴 - @RequiredArgsConstructor 을 쓰면 직접만들지 않아도된다
//    public JoinController(JoinValidator validator){
//        this.validator=validator;
//    }

    private final JoinService service;




    @GetMapping // 1) 공통매핑 + /join
                    // 2) 공통 매핑주소
    public String join(Model model){

//        model.addAttribute("title","회원가입");
//        model.addAttribute("content","회원가입 내용!");
        Join join = new Join();
        model.addAttribute("join",join);

        return "member/join";
    }

    @PostMapping
    public String joinPs(@Valid Join join, Errors errors, Model model){ // getter setter로 받아올수 있는 클래스를 하나 만들어서 주입하면 짧게 쓸수있다
                        //@Valid 객체는 바로뒤에 에러객체가 있어야된다

        validator.validate(join,errors);
        if(errors.hasErrors()){
            // 에러가 있으면 처리 x ->양식을보여줌
            return "member/join";
        }

        // 회원가입 처리
        service.join(join);


        // 성공시에는 회원 로그인
        return "redirect:/member/login";

    }




}

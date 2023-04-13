package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Exam02Controller {
    @GetMapping("/ex01")
    public String ex01(){
        boolean result = false;
        if(!result){
            throw new RuntimeException("예외발생1111111!!!!");
        }

        return "mypage/index";
    }


//    @ExceptionHandler(RuntimeException.class) // 예외페이지 설정
//    public String errorHandler(RuntimeException e, Model model){
//
//        e.printStackTrace();
//        model.addAttribute("message",e.getMessage());
//
//        return "errors/common";
//    }


}

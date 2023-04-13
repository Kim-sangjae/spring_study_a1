package controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers") // 공통 범위에서 적용하는 컨트롤러
public class CommonController {

    @ExceptionHandler(Exception.class) // 예외페이지 설정
    public String errorHandler(Exception e, Model model){

        e.printStackTrace();
        model.addAttribute("message",e.getMessage());

        return "errors/common";
    }
}

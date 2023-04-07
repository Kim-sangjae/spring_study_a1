package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.annotation.WebServlet;

@Controller //
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello"; // /WEB-INF/view/hello.jsp
    }

}

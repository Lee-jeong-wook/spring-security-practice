package egovframework.example.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
    @GetMapping("/")
    public String getHome(){
        return "index";
    }
}

package com.twice.home.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){


        /*
        * 차이점 꼭알자
        * @Controller <-> @RestController
        * @ResponseBody ?
        *
        * */
        return "home/index";
    }

}

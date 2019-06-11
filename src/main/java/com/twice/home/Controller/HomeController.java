package com.twice.home.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        /*
        * 차이점 꼭알자
        * @Controller : 일반적인 View(JSP) 를 리턴하는 경우에 사용 <-> @RestController Json/Data 를 Return 하는경우
        * @RestFulAPI란 Json/data 를 주고받는 방식을 말함
        * @ResponseBody ?
        *
        * */
        return "home/index";
    }
}

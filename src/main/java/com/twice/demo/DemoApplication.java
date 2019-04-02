package com.twice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @RequestMapping("/")
    public String inlineView(){

    //https://github.com/znak258/twicegram.git
//
//        echo "# twicegram" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git remote add origin https://github.com/znak258/twicegram.git
//        git push -u origin master
//        test
        return "test";

    }


}


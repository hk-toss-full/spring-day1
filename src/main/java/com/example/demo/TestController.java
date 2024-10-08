package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

// 컨트롤러 유저가 보는 곳
// @ annotation
// request 유저가 요청 하는것
// response 우리가 유저한테 주는 것
// localhost 내 컴 주소
// localhost:8080
// 내 컴퓨터에 http 통신 접근 할 수 있게 도와주는 것 web server
// 내 컴퓨터에 http 통신 접근 할 수 있게 해주고 코드를 돌리는 것 web application server (was)
// spring framework vs spring boot
// main(x) vs main(o)
// spring framework web 을 만들면 java x tomcat 실행
// spring framework 설정할게 많다... xml
// 언어  js java
// framework react spring (제약사항 o)
// library recoil thymeleaf
// @ 간단한 annotation 을 사용 해주면서 구현을 숨기고 편히 사용할 수 있게 해 줌
// spring 3 구성요소
// PSA 서비스 추상화 (Portable Service Abstraction)
// DI 의존성 주입 (dependency injection),
// IoC(Inversion of Control) 제어의 역전 IoC (spring bean) container
// AOP 관점지향 (aspect oriented programming)
// bean 스프링 내부에서 관리하는 static
// bean 들을 모아놓은 곳  IoC 컨테이너


// method: GET, POST
// GET body x url ? 데이터 =fdsfds
// POST body o json: {데이터:"ㄴㅇㄻ"}

@Controller
public class TestController {
//  빈에 꺼내 쓰는 것 (의존성 주입)
    String test2;
    Student 김현정;
    Data data;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("list", data.list);
        return "index";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postStudent(
            @RequestParam String name
            , @RequestParam Integer age){
        Student student = new Student(name, age);
        data.list.add(student);
        return "redirect:/";
    }
    // localhost:8080/java
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public String java(){
        return "java";
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "test";
    }


    public TestController(String test2, Student 김현정, Data data) {
        this.test2 = test2;
        this.김현정 = 김현정;
        this.data = data;
    }

}

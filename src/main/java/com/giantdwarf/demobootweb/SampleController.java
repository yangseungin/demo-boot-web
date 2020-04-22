package com.giantdwarf.demobootweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
public class SampleController {

    //preHandle 1
    //preHandle 2
    //요청처리
    //postHandle 2 <- postHandler는 역순으로 호출
    //postHandle 1
    //afterCompletion 2 <-afterCompletion 역시 역순으로 호출
    //afterCompletion 1

    @GetMapping("/hello")
    public String hello(@RequestParam("id") Person person){
        return "hello " + person.getName();
    }

    @GetMapping("message")
//    @ResponseBody @RestController를 사용중이라 모두 붙어있다고 생각하면 됨
    public String message(@RequestBody String body){
        return body;
    }

}

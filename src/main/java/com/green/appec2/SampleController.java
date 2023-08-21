package com.green.appec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("main")
    public String main(){
        return "index";
    }
}

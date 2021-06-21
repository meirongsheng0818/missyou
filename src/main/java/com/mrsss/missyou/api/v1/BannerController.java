package com.mrsss.missyou.api.v1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {

    @GetMapping("/test")
    public String test(){
        return "Hello,梅";
    }


    @PostMapping("/test1")
    public String test1(){
        return "Hello World";
    }
}

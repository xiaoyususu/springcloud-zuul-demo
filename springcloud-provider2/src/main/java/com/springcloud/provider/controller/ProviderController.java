package com.springcloud.provider.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ProviderController
 * @Description TODO
 * @Author boy
 * @Date 2019/12/28 6:26 PM
 */
@RestController
public class ProviderController {
    @RequestMapping("/hello")
    public String hello(){
        return "HelloProvider2";
    }
}

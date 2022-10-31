package com.zxd.controller;

import com.zxd.core.MyJsonService;
import com.zxd.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("demo")
public class DemoController {
    
    // 注入我们Starter中的服务类
    @Autowired
    private MyJsonService myJsonService;
    
    @GetMapping()
    public String test() {
        Person p = new Person("Mr.nobody", 18, "拉斯维加斯");
        // 调用服务方法
        return myJsonService.objectToMyJson(p);
    }
}

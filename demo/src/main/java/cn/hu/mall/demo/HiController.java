package cn.hu.mall.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hucc
 * 2022/4/30 10:23
 */
@RestController
public class HiController {

    @GetMapping("/")
    public String sayHi() {
        return "Hi Demo!";
    }

}

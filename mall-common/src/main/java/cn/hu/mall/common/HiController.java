package cn.hu.mall.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hucc
 * 2022/1/20 21:59
 */
@RestController
public class HiController {

    @GetMapping("/")
    public String sayHi() {
        return "Hi mall!";
    }

}

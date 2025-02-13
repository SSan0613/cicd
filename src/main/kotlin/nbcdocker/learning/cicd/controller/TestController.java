package nbcdocker.learning.cicd.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public void test1() {
        System.out.println("hello");
    }
}

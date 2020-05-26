package tianshengkj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class apiHandler {

    @GetMapping("/getCount")
    public int getCount(){
        return 1234;
    }
}

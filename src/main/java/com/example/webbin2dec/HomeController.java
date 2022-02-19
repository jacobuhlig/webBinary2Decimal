package com.example.webbin2dec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/bin2dec")
    public String Bin2Dec() {
        return "Bin2Dec";
    }
}

package com.adamzemmoura.biblioteca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}

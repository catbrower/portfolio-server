package com.browertech.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
//    "/{x:[\\w\\-]+}" , "/{x:^(?!api$).*$}/**/{y:[\\w\\-]+}"
    @RequestMapping(path = {"/", "/{x:[\\w\\-]+}" })
    public String index() {
        return "index";
    }
}

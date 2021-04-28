package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 7/22/18.
 */
@Controller
public class IndexController {
    // all possible parameters that can match
    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){
        // return will point to index.html under templates folder
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}

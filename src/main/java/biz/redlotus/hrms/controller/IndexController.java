package biz.redlotus.hrms.controller;

/**
 * Created by blogw on 2015/10/23.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    String index(ModelMap model){
        model.put("name", "弁慶弁護士");
        return "index";
    }
}
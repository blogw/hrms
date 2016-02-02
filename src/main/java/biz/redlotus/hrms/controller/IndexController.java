package biz.redlotus.hrms.controller;

/**
 * Created by blogw on 2015/10/23.
 */
import biz.redlotus.hrms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    String index(ModelMap model){
        Iterable<Object> userList=userService.findAllFetchProfile();
        model.put("name", "弁慶弁護士");
        model.put("userList",userList);
        return "index";
    }
}
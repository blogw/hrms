package biz.redlotus.hrms.api;

/**
 * Created by blogw on 2015/10/23.
 */
import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserJsonApi {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public @ResponseBody JsonResult findOne(@PathVariable Long id) {
        User user=userService.findByIdFetchProfile(id);
        return JsonResult.createJson(user);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public @ResponseBody JsonResult findAll() {
        Iterable<Object> users=userService.findAllFetchProfile();
        return JsonResult.createListJson(users);
    }
}
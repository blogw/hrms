package biz.redlotus.hrms.api;

/**
 * Created by blogw on 2015/10/23.
 */

import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.service.UserService;
import biz.redlotus.hrms.utils.BeanHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserJsonApi {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    JsonResult findOne(@PathVariable Long id) {
        User user = userService.findByIdFetchProfile(id);
        return JsonResult.createJson(user);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public
    @ResponseBody
    JsonResult findAll() {
        Iterable<Object> users = userService.findAllFetchProfile();
        return JsonResult.createListJson(users);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResult create(User user) {
        return JsonResult.createJson(userService.save(user));
    }

    // put not support profile.name
    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.POST)
    public
    @ResponseBody
    JsonResult update(@PathVariable Long id, User user) {
        return JsonResult.createJson(userService.update(id, user));
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public
    @ResponseBody
    JsonResult delete(@PathVariable Long id) {
        userService.delete(id);
        return new JsonResult();
    }
}
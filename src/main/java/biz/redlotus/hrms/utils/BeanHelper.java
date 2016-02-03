package biz.redlotus.hrms.utils;

import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.domain.UserProfile;
import org.springframework.ui.ModelMap;
/**
 * Created by blogw on 2016/02/02.
 */
public class BeanHelper {
    public static User toUser(ModelMap model){
        UserProfile profile=new UserProfile();
        User user=new User();

        profile.setName(model.get("name").toString());
        user.setLoginId(model.get("loginId").toString());
        user.setPassword(model.get("password").toString());

        user.setProfile(profile);
        return user;
    }
}

package biz.redlotus.hrms.bootstrap;

import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.domain.UserProfile;
import biz.redlotus.hrms.enumeration.SexEnum;
import biz.redlotus.hrms.repository.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class InitDatabase implements ApplicationListener<ContextRefreshedEvent> {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    private UserRepo userRepo;

    @Autowired
    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Calendar c = Calendar.getInstance();
        c.set(1900, 1, 1);

        UserProfile profile = new UserProfile();
        profile.setMail("admin@redlotus.biz");
        profile.setMobile("12345678900");
        profile.setName("管理員");
        profile.setBirth(c.getTime());
        profile.setPhoto("admin.png");
        profile.setSex(SexEnum.MALE);
        profile.setTel("12345678");
        profile.setCreateUser(-1L);

        User user = new User();
        user.setCreateUser(-1L);
        user.setLoginId("admin");
        user.setPassword("admin");
        user.setProfile(profile);

        userRepo.save(user);
    }
}
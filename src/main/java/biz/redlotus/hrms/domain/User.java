package biz.redlotus.hrms.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by blogw on 2016/02/01.
 */
@Entity
public class User extends BaseEntity{
    private String loginId;
    private String password;
    private Date lastLogin;

    @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, fetch = FetchType.LAZY)
    @JoinColumn(name = "profileId")
    private UserProfile profile;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public void setProfile(UserProfile profile) {
        this.profile = profile;
    }
}

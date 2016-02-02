package biz.redlotus.hrms.repository;

import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.domain.UserProfile;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by blogw on 2016/02/01.
 */
public interface UserProfileRepo extends CrudRepository<UserProfile, Long> {
}

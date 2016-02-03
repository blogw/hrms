package biz.redlotus.hrms.serviceif;

import biz.redlotus.hrms.domain.User;

/**
 * Created by blogw on 2016/02/01.
 */
public interface UserServiceIf {
    Iterable<User> findAll();

    User findById(Long id);

    User save(User user);

    User update(Long id,User user);

    void delete(Long id);

    Iterable<Object> findAllFetchProfile();

    User findByIdFetchProfile(Long id);
}

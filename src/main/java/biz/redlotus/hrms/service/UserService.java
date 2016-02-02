package biz.redlotus.hrms.service;

import biz.redlotus.hrms.domain.User;
import biz.redlotus.hrms.repository.UserRepo;
import biz.redlotus.hrms.serviceif.UserServiceIf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by blogw on 2016/02/01.
 */
@Service
public class UserService implements UserServiceIf {
    private UserRepo userRepo;

    @Autowired
    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepo.findOne(id);
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepo.delete(id);
    }

    @Override
    public Iterable<Object> findAllFetchProfile() {
        return userRepo.findAllFetchProfile();
    }

    @Override
    public User findByIdFetchProfile(Long id) {
        return userRepo.findByIdFetchProfile(id);
    }
}

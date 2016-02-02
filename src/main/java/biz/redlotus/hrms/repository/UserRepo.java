package biz.redlotus.hrms.repository;

import biz.redlotus.hrms.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by blogw on 2016/02/01.
 */
public interface UserRepo extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u JOIN FETCH u.profile")
    public Iterable<Object> findAllFetchProfile();

    @Query("SELECT u FROM User u JOIN FETCH u.profile WHERE u.id = (:id)")
    public User findByIdFetchProfile(@Param("id") Long id);
}

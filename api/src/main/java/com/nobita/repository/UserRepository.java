package com.nobita.repository;

import com.nobita.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The repository class for {@link User}.
 *
 * Created by yohei on 4/17/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

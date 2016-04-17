package com.nobita.repository;

import com.nobita.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The repository class for {@link User}.
 *
 * Created by yohei on 4/17/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}

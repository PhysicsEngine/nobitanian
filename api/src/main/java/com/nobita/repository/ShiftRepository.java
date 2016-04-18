package com.nobita.repository;

import com.nobita.domain.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The repository class for {@link Shift}.
 *
 * Created by yohei on 4/17/16.
 */
public interface ShiftRepository extends JpaRepository<Shift, Long> {
}

package com.nobita.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 *
 *
 * Created by yohei on 4/17/16.
 */
@Entity
public class Shift {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private Long userId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

}

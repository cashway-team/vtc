package com.cashway.entity;

import javax.persistence.*;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "ORGANIZATION")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_ORGANIZATION")
public class Organization extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

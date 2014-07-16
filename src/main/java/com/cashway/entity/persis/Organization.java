package com.cashway.entity.persis;

import javax.persistence.*;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "ORGANIZATION")
public class Organization {


    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_ORGANIZATION", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

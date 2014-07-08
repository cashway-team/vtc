package com.cashway.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/25.
 */
@Entity
@Table(name = "AGENTS_TYPE")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_AGENTS_TYPE")
public class AgentsType extends BaseEntity {

    @Column(name = "NO", nullable = false)
    private String no;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESC", nullable = false)
    private String desc;

    private Set<ArtificialAgents> artificialAgents = new HashSet<ArtificialAgents>();

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @ManyToMany(mappedBy = "agentsTypes")
    public Set<ArtificialAgents> getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(Set<ArtificialAgents> artificialAgents) {
        this.artificialAgents = artificialAgents;
    }
}

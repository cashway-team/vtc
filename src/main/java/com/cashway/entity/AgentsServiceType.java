package com.cashway.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "agents_service_type")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_AGENTS_SERVICE_TYPE")
public class AgentsServiceType extends BaseEntity {

    public interface Status {
        String MALE_SERVICE = "1";
        String PERSONAL_SERVICE = "2";
        String FINANCING = "3";
    }

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

    @ManyToMany(mappedBy = "agentsServiceTypes")
    public Set<ArtificialAgents> getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(Set<ArtificialAgents> artificialAgents) {
        this.artificialAgents = artificialAgents;
    }
}

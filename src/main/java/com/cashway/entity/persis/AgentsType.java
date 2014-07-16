package com.cashway.entity.persis;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/25.
 */
@Entity
@Table(name = "AGENTS_TYPE")
public class AgentsType {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_AGENTS_TYPE", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NO", nullable = false)
    private String no;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESC", nullable = false)
    private String desc;

    @ManyToMany(mappedBy = "agentsTypes")
    private Set<ArtificialAgents> artificialAgents = new HashSet<ArtificialAgents>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Set<ArtificialAgents> getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(Set<ArtificialAgents> artificialAgents) {
        this.artificialAgents = artificialAgents;
    }
}

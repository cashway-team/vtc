package com.cashway.entity.persis;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "AGENTS_SERVICE_TYPE")
public class AgentsServiceType {

    public interface Type {
        String MALE_SERVICE = "1";
        String PERSONAL_SERVICE = "2";
        String FINANCING = "3";
    }

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_SERVICE_TYPE", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "agentsServiceTypes")
    private Set<ArtificialAgents> artificialAgents = new HashSet<ArtificialAgents>();


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

    public Set<ArtificialAgents> getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(Set<ArtificialAgents> artificialAgents) {
        this.artificialAgents = artificialAgents;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

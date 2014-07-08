package com.cashway.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/16.
 */
@Entity
@Table(name = "artificial_agents")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "SQ_ARTIFICIAL_AGENTS")
public class ArtificialAgents extends BaseEntity {

    public interface Status {
        String ENABLED = "0";
        String DISABLED = "1";
    }

    @Column(name = "STATUS", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORG_ID", referencedColumnName = "ID", nullable = false)
    private Organization organization;

    @Column(name = "LAST_LOGIN_DATE", nullable = false)
    private Date lastLoginDate;

    private Set<AgentsType> agentsTypes = new HashSet<AgentsType>();

    private Set<AgentsServiceType> agentsServiceTypes = new HashSet<AgentsServiceType>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "rel_agents_type")
    public Set<AgentsType> getAgentsTypes() {
        return agentsTypes;
    }

    public String getAgentsTypesStr() {
        StringBuffer buffer = new StringBuffer();
        for (AgentsType type : this.getAgentsTypes()) {
            buffer.append(type.getNo() + ",");
        }

        String types = buffer.toString();
        if (types.length() > 0) {
            return types.substring(0, types.length() - 1);
        } else {
            return "";
        }
    }

    public void setAgentsTypes(Set<AgentsType> agentsTypes) {
        this.agentsTypes = agentsTypes;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "rel_agents_service_type")
    public Set<AgentsServiceType> getAgentsServiceTypes() {
        return agentsServiceTypes;
    }

    public String getAgentsServiceTypesStr() {
        StringBuffer buffer = new StringBuffer();
        for (AgentsServiceType type : this.getAgentsServiceTypes()) {
            buffer.append(type.getNo() + ",");
        }

        String types = buffer.toString();

        if (types.length() > 0) {
            return types.substring(0, types.length() - 1);
        } else {
            return "";
        }
    }

    public void setAgentsServiceTypes(Set<AgentsServiceType> agentsServiceTypes) {
        this.agentsServiceTypes = agentsServiceTypes;
    }
}

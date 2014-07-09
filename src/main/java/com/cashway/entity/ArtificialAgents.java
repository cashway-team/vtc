package com.cashway.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmzz on 2014/6/16.
 */
@Entity
@Table(name = "ARTIFICIAL_AGENTS")
public class ArtificialAgents {

    public interface Status {
        String ENABLED = "0";
        String DISABLED = "1";
    }

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_ARTIFICIAL_AGENTS", initialValue = 1000, allocationSize = 1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORG_ID", referencedColumnName = "ID", nullable = false)
    private Organization organization;

    @Column(name = "LAST_LOGIN_DATE", nullable = false)
    private Date lastLoginDate;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "REL_AGENTS_TYPE",
            joinColumns = { @JoinColumn(name = "AGENTS_ID", referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID") })
    private Set<AgentsType> agentsTypes = new HashSet<AgentsType>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "REL_AGENTS_SERVICE_TYPE",
            joinColumns = { @JoinColumn(name = "AGENTS_ID", referencedColumnName = "ID") },
            inverseJoinColumns = { @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID") })
    private Set<AgentsServiceType> agentsServiceTypes = new HashSet<AgentsServiceType>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

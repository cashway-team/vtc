package com.cashway.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mmzz on 2014/6/24.
 */
@Entity
@Table(name = "AGENTS_MEM_HISTORY")
public class ArtificialAgentsMemHistory {

    public interface Action {
        String REGISTRATION = "0";
        String QUIT = "1";
        String SIGN_IN = "2";
        String SIGN_OUT = "3";
        String AWAY = "4";
    }

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "SQ_AGENTS_MEM_HISTORY", initialValue=1000, allocationSize=1)
    @GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "AGENTS_ID", referencedColumnName = "ID", nullable = false)
    private ArtificialAgents artificialAgents;

    @Column(name = "ACTION", nullable = false)
    private String action;

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtificialAgents getArtificialAgents() {
        return artificialAgents;
    }

    public void setArtificialAgents(ArtificialAgents artificialAgents) {
        this.artificialAgents = artificialAgents;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

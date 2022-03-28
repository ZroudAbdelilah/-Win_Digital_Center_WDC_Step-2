package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "participants")
@PrimaryKeyJoinColumn(name = "user_id")
public class Participant extends User{
    @Column(name = "domain")
    private String domain;

    @Column(name = "structure")
    private String structure;

    public Participant() {
    }

    public Participant(String firstName, String lastName, String email, String password, String phoneNumber, Boolean status, Role role, String domain, String structure) {
        super(firstName, lastName, email, password, phoneNumber, status, role);
        this.domain = domain;
        this.structure = structure;
    }

    public Participant(Long userId, String firstName, String lastName, String email, String password, String phoneNumber, Boolean status, Role role, String domain, String structure) {
        super(userId, firstName, lastName, email, password, phoneNumber, status, role);
        this.domain = domain;
        this.structure = structure;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "domain='" + domain + '\'' +
                ", structure='" + structure + '\'' +
                '}';
    }
}

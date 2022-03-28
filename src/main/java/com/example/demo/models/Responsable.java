package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "responsables")
@PrimaryKeyJoinColumn(name = "user_id")
public class Responsable extends User{
    @Column(name = "domain")
    private String domain;

    @ManyToOne
    @JoinColumn(name = "responsable_type_id")
    private ResponsableType type;

    public Responsable() {
    }

    public Responsable(String firstName, String lastName, String email, String password, String phoneNumber, Boolean status, Role role, String domain, ResponsableType type) {
        super(firstName, lastName, email, password, phoneNumber, status, role);
        this.domain = domain;
        this.type = type;
    }

    public Responsable(Long userId, String firstName, String lastName, String email, String password, String phoneNumber, Boolean status, Role role, String domain, ResponsableType type) {
        super(userId, firstName, lastName, email, password, phoneNumber, status, role);
        this.domain = domain;
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }


    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ResponsableType getType() {
        return type;
    }

    public void setType(ResponsableType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Responsable{" +
                "domain='" + domain + '\'' +
                ", type=" + type +
                '}';
    }
}

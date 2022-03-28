package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "activiter_types")
public class ActiviterType {
    @Id
    @Column(name = "activiter_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long activiterTypeId;

    @Column(name = "type_name")
    private String typeName;

    public ActiviterType() {
    }

    public ActiviterType(Long activiterTypeId, String typeName) {
        this.activiterTypeId = activiterTypeId;
        this.typeName = typeName;
    }

    public ActiviterType(String typeName) {
        this.typeName = typeName;
    }

    public Long getActiviterTypeId() {
        return activiterTypeId;
    }

    public void setActiviterTypeId(Long activiterTypeId) {
        this.activiterTypeId = activiterTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "ActiviterType{" +
                "activiterTypeId=" + activiterTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}

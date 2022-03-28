package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "responsable_type")
public class ResponsableType {
    @Id
    @Column(name = "responsable_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long responsableTypeId;

    @Column(name = "type_name")
    private String typeName;

    public ResponsableType() {
    }

    public ResponsableType(Long responsableTypeId, String typeName) {
        this.responsableTypeId = responsableTypeId;
        this.typeName = typeName;
    }

    public ResponsableType(String typeName) {
        this.typeName = typeName;
    }

    public Long getResponsableTypeId() {
        return responsableTypeId;
    }

    public void setResponsableTypeId(Long responsableTypeId) {
        this.responsableTypeId = responsableTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "ResponsableType{" +
                "responsableTypeId=" + responsableTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}

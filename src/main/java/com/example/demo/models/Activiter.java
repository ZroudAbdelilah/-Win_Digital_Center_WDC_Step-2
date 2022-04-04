package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "activities")
public class Activiter {
    @Id
    @Column(name = "activiter_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long activiterId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date_start")
    private LocalDateTime dateStart;

    @Column(name = "date_end")
    private LocalDateTime dateEnd;

    @ManyToOne
    @JoinColumn(name = "activiter_type_id")
    private ActiviterType type;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    public Activiter() {
    }

    public Activiter(String title, String description, LocalDateTime dateStart, LocalDateTime dateEnd, ActiviterType type, Exercise exercise) {
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.type = type;
        this.exercise = exercise;
    }

    public Activiter(Long activiterId, String title, String description, LocalDateTime dateStart, LocalDateTime dateEnd, ActiviterType type, Exercise exercise) {
        this.activiterId = activiterId;
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.type = type;
        this.exercise = exercise;
    }

    public Long getActiviterId() {
        return activiterId;
    }

    public void setActiviterId(Long activiterId) {
        this.activiterId = activiterId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public ActiviterType getType() {
        return type;
    }

    public void setType(ActiviterType type) {
        this.type = type;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}

package com.example.demo.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "exercises")
public class Exercise {
    @Id
    @Column(name = "exercise_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exerciseId;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "date_start")
    private LocalDateTime dateStart;

    @Column(name = "date_end")
    private LocalDateTime dateEnd;

    @Column(name = "status_exercise")
    private Boolean statusExercise;

    public Exercise() {
    }

    public Exercise(Long exerciseId, String title, int year, LocalDateTime dateStart, LocalDateTime dateEnd, Boolean statusExercise) {
        this.exerciseId = exerciseId;
        this.title = title;
        this.year = year;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.statusExercise = statusExercise;
    }

    public Exercise(String title, int year, LocalDateTime dateStart, LocalDateTime dateEnd, Boolean statusExercise) {
        this.title = title;
        this.year = year;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.statusExercise = statusExercise;
    }

    public Long getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(Long exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public Boolean getStatusExercise() {
        return statusExercise;
    }

    public void setStatusExercise(Boolean statusExercise) {
        this.statusExercise = statusExercise;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "exerciseId=" + exerciseId +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", statusExercise=" + statusExercise +
                '}';
    }
}
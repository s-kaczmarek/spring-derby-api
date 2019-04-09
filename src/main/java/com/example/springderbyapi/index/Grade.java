package com.example.springderbyapi.index;

import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grade {
    @Id
    @GeneratedValue
    private Long id;
    private String className;

    @ManyToOne
    private Index index;

    private Double grade;

    public Grade(String className, Index index, Double grade) {
        this.className = className;
        this.index = index;
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", index=" + index +
                ", grade=" + grade +
                '}';
    }
}

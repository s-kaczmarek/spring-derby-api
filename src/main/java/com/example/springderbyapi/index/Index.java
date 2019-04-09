package com.example.springderbyapi.index;

import com.example.springderbyapi.student.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="indexes")
public class Index {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "studentsIndex")
    private Student studentOwner;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "grades_in_index")
    private List<Grade> grades = new ArrayList<>();

    private Double averageGrade;

    public Index(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Index{" +
                "id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }
}

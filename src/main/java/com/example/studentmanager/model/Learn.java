package com.example.studentmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="learn")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Learn {
    @Id
    @Column(name = "stid")
    private int stid;

    @Id
    @Column(name = "sbid")
    private int sbid;

    @ManyToOne
    @JoinColumn(name = "stid",referencedColumnName = "id") // Khóa ngoại đến Student
    private Student student;

    @ManyToOne
    @JoinColumn(name = "sbid",referencedColumnName = "id") // Khóa ngoại đến Subject
    private Subject subject;

    private int mark;

}

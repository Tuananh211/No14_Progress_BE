package com.example.studentmanager.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String birthday;
    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassA classA;

//    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinTable(
//            name="learn",
//            joinColumns = @JoinColumn(name = "stid",referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "sbid",referencedColumnName = "id")
//    )
//    private Set<Subject> subjects= new HashSet<>();
}

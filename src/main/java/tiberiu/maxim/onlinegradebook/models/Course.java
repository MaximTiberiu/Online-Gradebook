package tiberiu.maxim.onlinegradebook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tiberiu.maxim.onlinegradebook.models.users.Teacher;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Course")
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "course_weight")
    private double courseWeight;

    @Column(name = "seminar_weight")
    private double seminarWeight;

    @Column(name = "laboratory_weight")
    private double laboratoryWeight;

    @ManyToMany(mappedBy = "courses")
    private List<Teacher> teachers = new ArrayList<Teacher>();

    @OneToMany(mappedBy = "course")
    private List<StudentsCourses> studentsCourses = new ArrayList<StudentsCourses>();
}

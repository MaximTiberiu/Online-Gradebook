package tiberiu.maxim.onlinegradebook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tiberiu.maxim.onlinegradebook.models.users.Secretary;
import tiberiu.maxim.onlinegradebook.models.users.Student;
import tiberiu.maxim.onlinegradebook.models.users.Teacher;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Faculty")
@Table( name = "faculty",
        uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private University university;

    @OneToMany(mappedBy = "faculty")
    List<Teacher> teachers = new ArrayList<Teacher>();

    @OneToMany(mappedBy = "faculty")
    List<Secretary> secretaries = new ArrayList<Secretary>();

    @OneToMany(mappedBy = "faculty")
    List<Student> students = new ArrayList<>();
}

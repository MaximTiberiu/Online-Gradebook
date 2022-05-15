package tiberiu.maxim.onlinegradebook.models.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tiberiu.maxim.onlinegradebook.models.Faculty;
import tiberiu.maxim.onlinegradebook.models.StudentsCourses;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Student")
@Table(name = "student")
public class Student extends AbstractUser {

    @Column(name = "batch")
    private String batch;

    @ManyToOne
    @JoinColumn(name = "faculty_id", nullable = false)
    private Faculty faculty;

    @OneToMany(mappedBy = "student")
    private List<StudentsCourses> studentsCourses = new ArrayList<StudentsCourses>();
}

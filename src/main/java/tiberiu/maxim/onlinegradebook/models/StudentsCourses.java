package tiberiu.maxim.onlinegradebook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tiberiu.maxim.onlinegradebook.models.users.Student;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "StudentsCourses")
@Table(name = "students_courses")
@IdClass(StudentsCoursesId.class)
public class StudentsCourses implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Id
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "completion_date")
    private Date completionDate;

    @OneToMany(mappedBy = "studentsCourses")
    private List<Exam> exams = new ArrayList<Exam>();
}

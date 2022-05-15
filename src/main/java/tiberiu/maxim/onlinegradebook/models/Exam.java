package tiberiu.maxim.onlinegradebook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Exam")
@Table(name = "exam")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "examination_date")
    private Date examinationDate;

    @Column(name = "course_grade")
    private double courseGrade;

    @Column(name = "seminar_grade")
    private double seminarGrade;

    @Column(name = "laboratory_grade")
    private double laboratoryGrade;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false),
            @JoinColumn(name = "course_id", referencedColumnName = "course_id", nullable = false),
            @JoinColumn(name = "start_date", referencedColumnName = "start_date", nullable = false)
    })
    private StudentsCourses studentsCourses;
}

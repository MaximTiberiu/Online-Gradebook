package tiberiu.maxim.onlinegradebook.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "University")
@Table( name = "university",
        uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class University {

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

    @OneToMany(mappedBy = "university")
    private List<Faculty> faculties = new ArrayList<Faculty>();
}

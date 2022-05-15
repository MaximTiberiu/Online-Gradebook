package tiberiu.maxim.onlinegradebook.models.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tiberiu.maxim.onlinegradebook.models.Faculty;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Secretary")
@Table(name = "secretary")
public class Secretary extends AbstractUser {

    @ManyToOne
    @JoinColumn(name = "faculty_id", nullable = false)
    private Faculty faculty;
}

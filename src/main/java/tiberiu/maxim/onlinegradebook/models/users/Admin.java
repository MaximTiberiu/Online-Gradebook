package tiberiu.maxim.onlinegradebook.models.users;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends AbstractUser {
}

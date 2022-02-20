package ar.com.phoenos.exchange.bundle.user;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id @GeneratedValue
    private Long id;
    private String username;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "display_surname")
    private String displaySurname;
    private String password;
    private String email;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "passport_id")
    private String passportId;
    @Column(name="creation_date")
    private LocalDate creationDate;
    private Boolean activated;

    public User() {
    }

    public User(String username, String displayName, String displaySurname, String password, String email, LocalDate birthDate, String passportId, LocalDate creationDate, Boolean activated) {
        this.username = username;
        this.displayName = displayName;
        this.displaySurname = displaySurname;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
        this.passportId = passportId;
        this.creationDate = creationDate;
        this.activated = activated;
    }
}

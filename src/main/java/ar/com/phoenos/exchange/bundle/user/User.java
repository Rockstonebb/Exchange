package ar.com.phoenos.exchange.bundle.user;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;


@Entity
public class User {

    @Id @GeneratedValue
    private Long id;
    private String username;
    @Column(name = "display_name")
    private String displayName;
    @Column(name = "display_surname")
    private String displaySurname;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name="creation_date")
    private LocalDate creationDate;
    private String password;
    private String email;
    @Column(name = "passport_id")
    private String passportId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplaySurname() {
        return displaySurname;
    }

    public void setDisplaySurname(String displaySurname) {
        this.displaySurname = displaySurname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", displayName='" + displayName + '\'' +
                ", displaySurname='" + displaySurname + '\'' +
                ", birthDate=" + birthDate +
                ", creationDate=" + creationDate +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", passportId='" + passportId + '\'' +
                ", activated=" + activated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username) && displayName.equals(user.displayName) && displaySurname.equals(user.displaySurname) && birthDate.equals(user.birthDate) && creationDate.equals(user.creationDate) && password.equals(user.password) && email.equals(user.email) && passportId.equals(user.passportId) && activated.equals(user.activated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, displayName, displaySurname, birthDate, creationDate, password, email, passportId, activated);
    }

}

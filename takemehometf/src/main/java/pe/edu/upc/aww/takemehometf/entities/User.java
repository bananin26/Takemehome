package pe.edu.upc.aww.takemehometf.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name="name",length = 45,nullable = false)
    private String name;
    @Column(name="username",nullable = false)
    private String username;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(length = 2000)
    private String urlImage;
    @Column(name = "phone",nullable = false)
    private String phone;
    @Column(name = "birthday",nullable = false)
    private LocalDate birthday;
    @Column(name = "country",nullable = false)
    private String country;
    @Column(name = "password",nullable = false)
    private String password;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public User() {
    }

    public User(int idUser, String name, String username, String email,  String urlImage,String phone, LocalDate birthday, String country, String password) {

        this.idUser= idUser;
        this.name = name;
        this.username = username;
        this.email = email;
        this.urlImage=urlImage;
        this.phone=phone;
        this.birthday = birthday;
        this.country = country;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

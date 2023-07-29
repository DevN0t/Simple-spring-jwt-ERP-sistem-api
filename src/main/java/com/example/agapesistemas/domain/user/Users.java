package com.example.agapesistemas.domain.user;
import jakarta.persistence.*;
import lombok.*;

@Table(name="users")
@Entity(name="userdata")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Integer userenter;
    private String userpass;
    private Boolean active;

    public Users(RequestUser requestUser){
        this.userenter = requestUser.userenter();
        this.userpass = requestUser.userpass();
        this.active = true;
    }
}

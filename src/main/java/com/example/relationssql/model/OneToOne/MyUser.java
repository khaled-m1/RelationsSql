package com.example.relationssql.model.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor @Setter @Getter
@Entity
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;

    @OneToOne(mappedBy = "myUser",cascade = CascadeType.ALL)
    // primary Kay from MyUser To MyUserDetails
    @PrimaryKeyJoinColumn
    private MyUserDetails myUserDetails;

}

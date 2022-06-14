package com.example.relationssql.model.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor
@Setter
@Getter
@Entity
public class MyUserDetails {
    @Id
    private Long detailsId;
    private String phoneNumber;
    private Integer height;
    private Integer age;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId // make relations detailsId => MyUser
    @JoinColumn(name = "userId") // make new name
    @JsonIgnore // disable contact from MyUser
    private MyUser myUser;
}

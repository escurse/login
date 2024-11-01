package com.escass.login.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class UserEntity {
    private String id;
    private String password;
    private String nickname;
    private Date registerDate;
}

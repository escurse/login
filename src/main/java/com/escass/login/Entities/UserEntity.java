package com.escass.login.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class UserEntity {
    private String id;
    private String password;
    private String nickname;
    private LocalDateTime registerDate;
}

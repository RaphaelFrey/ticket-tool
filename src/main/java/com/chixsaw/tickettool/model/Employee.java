package com.chixsaw.tickettool.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Raphael Frey on 04.12.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {
    @Column(name = "email")
    private String mail;
    @Column(name = "password")
    private String password;
    @Column(name = "username")
    private String username;
}

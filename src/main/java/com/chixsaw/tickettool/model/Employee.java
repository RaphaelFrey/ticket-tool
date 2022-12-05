package com.chixsaw.tickettool.model;


import jakarta.persistence.*;
import lombok.*;

/**
 * Created by Raphael Frey on 04.12.2022
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String username;
}

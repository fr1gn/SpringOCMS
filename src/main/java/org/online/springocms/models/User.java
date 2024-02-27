package org.online.springocms.models;

import jakarta.persistence.*;
import lombok.Data;
//ddd
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String FirstName;
    private String LastName;
    private String email;
    private String password;
    private String role;
}
//d
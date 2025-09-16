package com.oneday.user.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bigint auto increment
    private Long id;

    @Column(length = 50, nullable = true)
    private String username;

    @Column(length = 255, nullable = true)
    private String password;

    @Column(length = 100, nullable = false) // nvarchar(100), not null
    private String name;

    @Column(length = 100, nullable = true)
    private String email;

    @Column(length = 20, nullable = true)
    private String provider;

    @Column(name = "provider_id", length = 100, nullable = true)
    private String providerId;

    @Column(length = 20, nullable = true)
    private String role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}

package com.example.liquibase_demo.models

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import lombok.NoArgsConstructor
import java.io.Serializable

@Entity
@Table(name = "students")
@NoArgsConstructor
class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    var id: Long,

    @Column(nullable = false, name = "first_name")
    var firstName: String,

    @Column(nullable = false, name = "last_name")
    var lastName: String,

    @Column(nullable = false, name = "email")
    @JsonIgnore
    var email: String,

    @Column(name = "address")
    var address: String,
) : Serializable
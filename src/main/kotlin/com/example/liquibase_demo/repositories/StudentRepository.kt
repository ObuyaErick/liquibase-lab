package com.example.liquibase_demo.repositories

import com.example.liquibase_demo.models.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>
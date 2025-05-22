package com.example.liquibase_demo.controllers

import com.example.liquibase_demo.models.Student
import com.example.liquibase_demo.repositories.StudentRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentsController(
    private val studentRepository: StudentRepository
) {

    @GetMapping("/students")
    fun index(): ResponseEntity<List<Student>> {
        return ResponseEntity.ok(studentRepository.findAll())
    }
}
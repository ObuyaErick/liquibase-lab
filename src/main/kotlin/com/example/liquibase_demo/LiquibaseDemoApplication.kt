package com.example.liquibase_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiquibaseDemoApplication

fun main(args: Array<String>) {
	runApplication<LiquibaseDemoApplication>(*args)
}

package com.es.libreria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.es.libreria.repository"])
class LibreriaApplication

fun main(args: Array<String>) {
	runApplication<LibreriaApplication>(*args)
}

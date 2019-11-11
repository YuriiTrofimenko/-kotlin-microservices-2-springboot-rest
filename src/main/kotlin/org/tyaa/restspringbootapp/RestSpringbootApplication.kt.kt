package org.tyaa.restspringbootapp


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestSpringbootApplication

fun main(args: Array<String>) {
  runApplication<RestSpringbootApplication>(*args)
}
package com.lisa.springboot_basics_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootBasicsKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringbootBasicsKotlinApplication>(*args)
	//runApplication<TodoController>(*args)
}

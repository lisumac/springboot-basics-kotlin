package com.lisa.springboot_basics_kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todo")
class TodoController {
    @GetMapping
    fun getTodo(): List<String> {
        return listOf("Hello 1", "Hello 1", "Hello 1", "Hello 1")
    }
}
package com.example.demo

import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/hello")
    fun greeting(@PathParam("name") name: String): String {
        return "Hello, $name"
    }
}
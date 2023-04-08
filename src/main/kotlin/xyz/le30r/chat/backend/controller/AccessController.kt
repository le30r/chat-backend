package xyz.le30r.chat.backend.controller

import org.springframework.security.access.annotation.Secured
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AccessController {
    @GetMapping("/")
    fun getHelloWorld(): String {
        return "Hello, world!"
    }
}
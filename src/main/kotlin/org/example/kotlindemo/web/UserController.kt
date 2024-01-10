package org.example.kotlindemo.web

import org.example.kotlindemo.service.RegisterService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController(
    private val registerService: RegisterService
) {

    @GetMapping("/register/{name}")
    fun register(@PathVariable name: String) {
        registerService.hello(name)
        println("회원가입을 완료했어요")
    }

}
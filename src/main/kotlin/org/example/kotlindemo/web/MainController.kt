package org.example.kotlindemo.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class MainController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "index"
    }

    @GetMapping("/post")
    fun post(): String{
        return "/post/index"
    }

}
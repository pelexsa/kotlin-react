package org.example.kotlindemo.service

import org.example.kotlindemo.domain.event.RegisteredEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class RegisterService (private val publisher: ApplicationEventPublisher){

    fun hello(name: String) {
        println("회원 추가 완료")
        publisher.publishEvent(RegisteredEvent(name))
    }


}
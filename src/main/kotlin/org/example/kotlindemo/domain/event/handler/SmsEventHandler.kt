package org.example.kotlindemo.domain.event.handler

import org.example.kotlindemo.domain.event.RegisteredEvent
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class SmsEventHandler {

    @Async
    @EventListener
    fun sendSms(event: RegisteredEvent) {
        println("${event.name} 님에게 가입 축하 메시지를 전송했습니다.")
    }

    @Async
    @EventListener
    fun makeCoupon(event: RegisteredEvent) {
        println("${event.name} 님에게 쿠폰을 전송했습니다.")
    }

}
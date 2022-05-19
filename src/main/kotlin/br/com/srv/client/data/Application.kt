package br.com.srv.client.data

import feign.Logger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableFeignClients
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@Bean
fun feignLoggerLevel(): Logger.Level? {
    return Logger.Level.FULL
}

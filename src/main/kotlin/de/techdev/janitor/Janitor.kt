package de.techdev.janitor

import de.techdev.pocket.api.Pocket
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling

fun main(args: Array<String>): Unit {
    SpringApplication.run(Janitor::class.java, *args)
}

@EnableScheduling
@SpringBootApplication
open class Janitor(
        @Value("\${pocket.consumer}") private val consumer: String,
        @Value("\${pocket.access}") private val access: String) {

    @Bean
    open fun pocket(): Pocket {
        return Pocket.connect(consumer, access)
    }

}

package de.techdev.janitor

import de.techdev.pocket.api.Pocket
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

val access   = "56de666b-76eb-0dd4-94cb-5d839f"
val consumer = "40519-58cacc95cba03ad3d23b2ba6"

fun main(args: Array<String>): Unit {
    SpringApplication.run(Janitor::class.java, *args)
}

@SpringBootApplication
open class Janitor {

    @Bean
    open fun pocket(): Pocket {
        return Pocket.connect(consumer, access)
    }

}

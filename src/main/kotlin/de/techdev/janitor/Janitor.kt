package de.techdev.janitor

import de.techdev.pocket.api.Pocket

val access   = "56de666b-76eb-0dd4-94cb-5d839f"
val consumer = "40519-58cacc95cba03ad3d23b2ba6"

fun main(args: Array<String>): Unit {
    val pocket = Pocket.connect(consumer, access)
    pocket.retrieveOperations().items().forEach(::println)
}

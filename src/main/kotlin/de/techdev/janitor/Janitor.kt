package de.techdev.janitor

import java.io.PrintStream as Printer

fun main(args: Array<String>): Unit {
    val name: String = "Janitor"
    var version = "0.0.1"

    fun Printer.echo() = "$name v$version"

    println(System.out.echo())
}
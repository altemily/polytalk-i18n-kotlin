package com.ariane.polytalk

import java.util.Locale
import java.util.ResourceBundle

fun main() {

    println("Select language / Selecione o idioma / Seleccione el idioma")
    println("1 - Português")
    println("2 - English")
    println("3 - Español")
    print("Opção: ")

    val option = readLine()?.trim()

    val locale = when (option) {
        "1" -> Locale("pt", "BR")
        "2" -> Locale("en", "US")
        "3" -> Locale("es", "ES")
        else -> {
            println("Opção inválida. Usando Português como padrão.")
            Locale("pt", "BR")
        }
    }

    Locale.setDefault(locale)

    val messages = ResourceBundle.getBundle("messages")

    println()
    println(messages.getString("app.welcome"))
    println(messages.getString("app.message"))
}

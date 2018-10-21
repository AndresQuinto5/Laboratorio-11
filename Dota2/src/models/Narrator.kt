package models
//Declaramos los valores del narrador incluyendo que es una interfaz
interface Narrator {
    fun narrate(eventType: String): String

}
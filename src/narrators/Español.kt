package narrators

import models.Narrator

class Español :Narrator {
    //Creamos los dialogos del narrador cuando ocurran ciertas acciones

    override fun narrate(eventType: String): String {

        when (eventType) {
            "Welcome back" -> {
                return """
                    | ¡Bienvenidos a todos!
                """.trimIndent()
            }
            "Game Start" -> {
                return """
                    | ¡Comienza el juego!
                """.trimMargin()
            }
            "kill Occurred" -> {
                return """
                    | ¡Ha ocurrido una muerte!
                """.trimMargin()
            }
            "Two or more kills occurred" -> {
                return """
                    | ¡Multiples eliminaciones! Que Comienzen los bativergasos
                """.trimMargin()
            }
            "five kills occurred PENTAKILL" -> {
                return """
                    | ¡¡¡5 muertes!!! IMPOSIBLE, 5 Heroes caidos ¡Que barbaridad de partida!
                    """.trimMargin()
            }
            "Tower has fallen" -> {
                return """
                    | ¡Una torre ha sido destruida!
                """.trimMargin()
            }
            "Radiant Wins!" -> {
                return """
                    | ¡El equipo Radiant ha ganado!
                """.trimMargin()
            }

            "Dire Wins!" -> {
                return """
                    | ¡El equipo Dire ha ganado!
                """.trimMargin()
            }

            else -> return ""
        }
    }


}
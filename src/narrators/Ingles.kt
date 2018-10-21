package narrators

import models.Narrator

class NarradorEnIngles:Narrator {
//Narrador en ingles!

    override fun narrate(eventType: String): String {

        when (eventType) {
            "Welcome back" -> {
                return """
                    | ¡Welcomeback everyone!
                """.trimIndent()
            }
            "Game Start" -> {
                return """
                    | ¡The game has begun!
                """.trimMargin()
            }
            "kill Occurred" -> {
                return """
                    | ¡A kill has ocurred!
                """.trimMargin()
            }
            "Two or more kills occurred" -> {
                return """
                    | ¡Multiple eliminations! the bativergasos had begun
                """.trimMargin()
            }
            "five kills occurred PENTAKILL" -> {
                return """
                    | ¡¡¡5 eliminations!!! IMPOSIBLE, 5 Heroes had death ¡What a impressive match!
                    """.trimMargin()
            }
            "Tower has fallen" -> {
                return """
                    | ¡A tower has fallen!
                """.trimMargin()
            }
            "Radiant Wins!" -> {
                return """
                    | ¡Team Radiant wins the match!
                """.trimMargin()
            }

            "Dire Wins!" -> {
                return """
                    | ¡Team Dire wins the match!
                """.trimMargin()
            }

            else -> return ""
        }
    }


}
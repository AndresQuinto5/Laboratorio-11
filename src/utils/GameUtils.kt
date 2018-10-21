package utils
//Importamos el modelo de heroe
import models.Hero

object GameUtils{
    fun getDummyHeroes():ArrayList<Hero> {
        return arrayListOf<Hero>( //Desplegamos una lista de heroes y su estilo de heroe, informacion sacada del Dota2

                Hero("Queen of Pain", "Intelligence"),
                Hero("Medusa", "Agility"),
                Hero("Viper", "Agility"),
                Hero("Tiny", "Strength"),
                Hero("Sven", "Strength"),
                Hero("Underlord", "Strength"),
                Hero("Weaver", "Agility"),
                Hero("Visage", "Intelligence"),
                Hero("Silencer", "Intelligence"),
                Hero("Puck", "Intelligence"),
                Hero("Axe", "Strength"),
                Hero("Io", "Strength"),
                Hero("Kunkka", "Strength"),
                Hero("Anti-Mage", "Agility"),
                Hero("Luna", "Agility"),
                Hero("Medusa", "Agility"),
                Hero("Doom", "Strength"),
                Hero("Bane", "Intelligence"),
                Hero("Dazzle", "Intelligence"),
                Hero("Lion", "Intelligence")
        )

    }
}




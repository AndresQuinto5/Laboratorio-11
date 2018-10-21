package models
//Establecemos los que tendra un equipo, su titan y sus 5 heroes que lucharan en la partida.
class Team() {

    val ancient = Ancient()

    val heroes = ArrayList<Hero>()
    val towers = ArrayList<Tower>()


    fun addHero(hero:Hero){
        if(heroes.size < 5){
            heroes.add(hero)
        }
    }

    fun addTower(){
        if(towers.size < 5){
            towers.add(Tower())
        }
    }


}
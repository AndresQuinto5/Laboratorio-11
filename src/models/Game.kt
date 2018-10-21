package models

class Game<D>(val narrador: D, var radiantDeaths: Int, var direDeaths: Int, var winner: Int) where D: Narrator {

    lateinit var radiantTeam: Team
    lateinit var direTeam: Team

    fun welcome(): String{
        return narrateSomething(narrador, "Welcome back")
    }
    fun gameStart(): String{
        return narrateSomething(narrador,"Game Start")
    }

    fun killOccurred(isRadiant: Boolean): String{
        if (isRadiant){
            this.direTeam!!.heroes.removeAt(0)
            this.radiantDeaths += 1
        } else {
            this.radiantTeam!!.heroes.removeAt(0)
            this.direDeaths += 1
        }
        return narrateSomething(narrador, "kill Occurred")
    }

    fun multipleKillsOccurred(isRadiant: Boolean, numberOfKills:Int): String{
        if(isRadiant){
            for (i in 0..(numberOfKills-1)){
                this.direTeam!!.heroes.removeAt(0)
            }
            this.radiantDeaths += numberOfKills
        }else {
            for (i in 0..(numberOfKills-1)){
                this.radiantTeam!!.heroes.removeAt(0)
            }
            this.direDeaths += numberOfKills
        }
        return narrateSomething(narrador,"Two or more kills occurred")
    }

    fun fiveKillsOccurred(isRadiant: Boolean) :String{
        if(isRadiant){
            for (i in 0..5){
                this.direTeam!!.heroes.removeAt(0)

            }
            this.radiantDeaths += 5
        }else {
            for (i in 0..5){
                this.radiantTeam!!.heroes.removeAt(0)
            }
            this.direDeaths += 5
        }
        return narrateSomething(narrador,"five kills occurred PENTAKILL")
    }

    fun towerKilled(isRadiant: Boolean): String{
        if (isRadiant){
            this.direTeam!!.towers.removeAt(0)
            this.radiantDeaths += 1
        } else {
            this.radiantTeam!!.towers.removeAt(0)
            this.direDeaths += 1
        }
        return narrateSomething(narrador,"Tower has fallen")
    }

    fun ancientKilled(isRadiant: Boolean): String{
        if (isRadiant){
            this.radiantDeaths += 1
            this.winner = 0
            return narrateSomething(narrador,"Radiant Wins!")

        }
        this.direDeaths += 1
        this.winner = 1
        return narrateSomething(narrador,"Dire Wins!")

    }

    private fun narrateSomething(narrator: Narrator, eventType: String): String{
        return narrator.narrate(eventType)
    }





}
package KotlinFiles

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    var list = ArrayList<Leaderboard>(listOf(
            Leaderboard("dhruv", "3", "hard"),
            Leaderboard("dhruv", "5", "easy"),
            Leaderboard("dhruv", "8", "medium"),
            Leaderboard("aman", "4", "hard"),
            Leaderboard("aman", "6", "easy")
    ))

}

data class Leaderboard(
        var name : String,
        var score : String,
        var level : String
)
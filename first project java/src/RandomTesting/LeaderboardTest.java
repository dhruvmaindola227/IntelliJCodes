package RandomTesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LeaderboardTest {
    public static void main(String[] args) {
        ArrayList<Leaderboard> list = new ArrayList<>(Arrays.asList(
                new Leaderboard("dhruv" , "3" , "hard"),
                new Leaderboard("dhruv" , "5" , "easy"),
                new Leaderboard("dhruv" , "8" , "medium"),
                new Leaderboard("aman" , "4" , "hard"),
                new Leaderboard("aman" , "6" , "easy")
        ));
//        System.out.println(list.stream().filter(
//                p -> p.name.equals("dhruv")
//        ).collect(Collectors.toList()).stream().filter(
//                p -> p.level == "easy"
//        ).toList().stream().filter(
//                p -> Integer.parseInt(p.score)> Integer.parseInt("5")
//        ).toList());

    }
}

class Leaderboard{
    String name;
    String score;
    String level;

    public Leaderboard(){}

    public Leaderboard(String name, String level, String score) {
        this.name = name;
        this.level = level;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Leaderboard{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
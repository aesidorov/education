package Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatchDay {

    private static Random random = new Random();



    public static void main(String[] args) {
        int startStaff = 10;
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < startStaff; i++) {
            players.add(getRandomPlayer());
        }

        for (int i = 0; i < 90; i++) {
            int randomCount = random.nextInt(players.size());
            Player tempPlayer = players.get(randomCount);
            tempPlayer.randomAction();

            if (i % 10 == 0){
                players.add(getRandomPlayer());
            }

        }
        System.out.println(players.size());
        int changeStaff = players.size() - startStaff;
        System.out.println("за игру на поле вышло " + changeStaff + " игроков");

    }


    public static Player getRandomPlayer() {
        Player tempPlayer = null;
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                tempPlayer = new ClubPlayer();
                break;
            case 1:
                tempPlayer = new OpponentPlayer();
                break;
            case 2:
                tempPlayer = new OutstaffPlayer();
                break;
        }
        return tempPlayer;
    }
}

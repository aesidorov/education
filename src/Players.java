import oldLesson.CountryList;
import oldLesson.FootbalRoleList;

import java.util.ArrayList;
import java.util.List;


public class Players {

/* Задача: сформировать список игроков команды на матч. Вывести их
    public static void main(String[] args) {
        List<String> players = getMatchTeam();
        System.out.println(players);
    }

    private static List<String> getMatchTeam(){
        List<String> players = new ArrayList<String>() {{
            add("Лунёв");
            add("Лещук");
            add("Скопинцев");
            add("Эли Даса");
            add("Гомес");
            add("Нгамалё");
            add("Смолов");
            add("Бальбуэна");
            add("Гагнидзе");
            add("Smolov");
        }};
        return players;
    }
 */

    private String playerName;
    private Integer countgamesToClub;

    public Players(String playerName, Integer countgamesToClub) {
        this.playerName = playerName;
        this.countgamesToClub = countgamesToClub;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getCountgamesToClub() {
        return countgamesToClub;
    }

    public void setCountgamesToClub(Integer countgamesToClub) {
        this.countgamesToClub = countgamesToClub;
    }


    @Override
    public String toString() {
        return playerName + " - " + countgamesToClub;
    }
}

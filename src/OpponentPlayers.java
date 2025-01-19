import java.util.ArrayList;
import java.util.List;


public class OpponentPlayers {

/* Задача: сформировать список игроков оппонентов команды на матч. Вывести их
    public static void main(String[] args) {
        List<String> opponentPlayers = new ArrayList<>();
        opponentPlayers.add("Мозес Кобнан");
        opponentPlayers.add("Олакунле Олусегун");
        opponentPlayers.add("Фёдор Смолов");
        opponentPlayers.add("Джон Кордоба");
        opponentPlayers.add("Витор Са");
        opponentPlayers.add("Никита Кривцов");
        opponentPlayers.add("Жуан Баши");
        opponentPlayers.add("Юрий Газинский");
        opponentPlayers.add("Данила Козлов");
        opponentPlayers.add("Кевин Пина");
        String outName = opponentPlayers.get(1);
        System.out.println(outName);
        for (int i = 0; i < opponentPlayers.size(); i++) {
            System.out.println(opponentPlayers.get(i));
        }

    }

 */


    private String playerName;
    private Integer countgamesToClub;

    public OpponentPlayers(String playerName, Integer countgamesToClub) {
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

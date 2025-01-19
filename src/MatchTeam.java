import java.util.ArrayList;
import java.util.List;

public class MatchTeam {


//Задача выбрать в команду игроков, которые играют за каждый клуб более 3 лет
    public static void main(String[] args) {
        List<Players> player = getPlayers();
        System.out.println(player);
        List<Players> mustExperiencePlayer = new ArrayList<>();
        System.out.println(mustExperiencePlayer);                               // <------------------- не совсем понимаю почему тут выводится пустой массив?



        List<OpponentPlayers> opponentPlayer = getOpponentPlayers();
        System.out.println(opponentPlayer);
        List<OpponentPlayers> mustExperienceOpponentPlayers = new ArrayList<>();


        for (Players temp : player) {
            if (temp.getCountgamesToClub() > 20) {
                mustExperiencePlayer.add(temp);
                System.out.println(mustExperiencePlayer);
            }
        }


        for (OpponentPlayers opponentTemp : opponentPlayer) {
            if (opponentTemp.getCountgamesToClub() > 20) {
                mustExperienceOpponentPlayers.add(opponentTemp);
            }
        }
        System.out.println(mustExperienceOpponentPlayers);
    }


    private static List<Players> getPlayers () {
        List<Players> players = new ArrayList<Players>() {{
            add(new Players("Лунёв", 20));
            add(new Players("Лещук", 5));
            add(new Players("Скопинцев", 14));
            add(new Players("Эли Даса", 13));
            add(new Players("Гомес", 2));
            add(new Players("Нгамалё", 22));
            add(new Players("Смолов", 7));
            add(new Players("Бальбуэна", 4));
            add(new Players("Гагнидзе", 12));
            add(new Players("Smolov", 16));
        }};
        return players;
    }

    private static List<OpponentPlayers> getOpponentPlayers () {
        List<OpponentPlayers> opponentPlayers = new ArrayList<OpponentPlayers>() {{
            add(new OpponentPlayers("Мозес Кобнан", 20));
            add(new OpponentPlayers("Олакунле Олусегун", 5));
            add(new OpponentPlayers("Фёдор Смолов", 14));
            add(new OpponentPlayers("Джон Кордоба", 13));
            add(new OpponentPlayers("Витор Са", 2));
            add(new OpponentPlayers("Никита Кривцов", 25));
            add(new OpponentPlayers("Жуан Баши", 7));
            add(new OpponentPlayers("Юрий Газинский", 4));
            add(new OpponentPlayers("Данила Козлов", 12));
            add(new OpponentPlayers("Кевин Пина", 16));
        }};
        return opponentPlayers;
    }
}

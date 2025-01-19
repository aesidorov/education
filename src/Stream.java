import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Footballs> peoples = new ArrayList<Footballs>() {{                             //    <-------------при названии переменной совпадающей с переменной в другом классе и удалении класса - происходит фатал
            add(new Footballs("Лунёв", 20, "RU", "defender"));
            add(new Footballs("Лещук", 15, "RU", "midfielder"));
            add(new Footballs("Нгамалё", 10, "AF", "midfielder"));
            add(new Footballs("Бальбуэна", 3, "LT", "defender"));
            add(new Footballs("Смолов", 22, "RU", "defender"));
        }};
        peoples.stream().filter(temp -> temp.getCountry().equals("RU")).forEach(System.out::println);

        List<String> onlyRuplayers = peoples.stream()
                .filter(x->x.getCountry().equals("RU"))
                .map(Footballs::getPlayerName)
                .collect(Collectors.toList());
        System.out.println(onlyRuplayers);


        Footballs lastPlayers = peoples.get(peoples.size()-1);
        System.out.println(lastPlayers.getPlayerName());
        Footballs streamPlayers = peoples.stream().reduce((x, y) -> y).get();
        System.out.println(streamPlayers.getPlayerName());

        peoples.stream().filter(temp -> temp.getRole().equals("Golkeeper"))
                .findFirst().orElseThrow(()-> new IllegalArgumentException("Golkeeper not found"));
    }

}

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> count = new java.util.HashMap<String, Integer>() {{
        put("Лунёв", 20);
        put("Лещук", 15);
        put("Нгамалё", 10);
        put("Бальбуэна", 3);
        put("Смолов", 3);
        put("Смолов", 13);
        }};
        System.out.println(count);

        Map<String, Integer> revers = count.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (first, second) -> first, LinkedHashMap:: new));
        System.out.println(revers);

    }
}

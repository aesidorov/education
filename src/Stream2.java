import sun.security.krb5.internal.crypto.RsaMd5CksumType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<String> role = Arrays.asList(
                "Center",
                "Defenders",
                "Midfielders",
                "Forwards",
                "Spares",
                "Goalkeepers",
                "Defence",
                "Left Back",
                "Right Back",
                "Center");
        List<String> uniq = role.stream().distinct().collect(Collectors.toList());
//        System.out.println(uniq);

//        List<String> endForRES = role.stream().filter(x->x.endsWith("res")).collect(Collectors.toList());
//        System.out.println(endForRES);

        String firstRole = role.stream().filter(x->x.endsWith("ers")).findFirst().get();
        String randomRole = role.stream().filter(x->x.endsWith("ers")).findAny().get();
        String randomRoleParallel = role.stream().parallel().filter(x->x.endsWith("ers")).findAny().get();

//        System.out.println(firstRole);
//        System.out.println(randomRole);
//        System.out.println(randomRoleParallel);

        Random random = new Random();
        int rand = random.nextInt(role.size());
//        System.out.println(role.get(rand));

        // - вопрос - а как выбирать методы, которые будут работать на все классы, а какие методы идут на конкретный класс.
        // - если всзять например авторизацию, там метод get почему он вынесен в ядро, а не в каждом отдельном классе прописывается. Например, рандом тоже общий для всех?

        Boolean endedERS = role.stream().allMatch(x->x.endsWith("ers"));
        Boolean endedACK = role.stream().noneMatch(x->x.endsWith("york"));

        System.out.println(endedERS);
        System.out.println(endedACK);

    }
}

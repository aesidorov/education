import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// Задание: Создание массива игроков напрямую + посчитать число элементов + вывести + создать массив должностей
    public static void main(String[] args) {
        String[] players = new String[10];
        players[0] = "Лунёв";
        players[1] = "Лещук";
        players[2] = "Скопинцев";
        players[3] = "ЭлиДаса";
        players[4] = "Диего";
        players[5] = "Гомес";
        players[6] = "Нгамалё";
        players[7] = "Смолов";
        players[8] = "Бальбуэна";
        players[9] = "Гагнидзе";
        System.out.println("Сегодня будем смотреть игру Динамо - Спартак!");
        System.out.println("Команда Динамо на игру: " + Arrays.asList(players));
        System.out.println("На дружеский матч со спартаком Динамо привезли всего лишь " + players.length + " игроков");

        String[] roles = new String[]{"Вратарь", "Защитник", "Полузащитник", "Нападающий"};
        System.out.println("В команде Динамо есть: " + Arrays.asList(roles) + "\n");


// Задание: создане массива тренеров используя конструктов из предыдущих уроков с несколькими параметрами


        Team[] coachs = new Team[3];
        coachs[0] = new Team("Russia", 365);
        coachs[1] = new Team("USA", 520);
        coachs[2] = new Team("Brazilia", 180);

        System.out.println("Количество тренеров = " + coachs.length);
        System.out.println(Arrays.asList(coachs));  //                                                              <-------------- выводит не значение, а хэши

//TODO - не понимаю почему не работет вывод массива - строчка выше


        for (int i = 0; i < coachs.length; i++) {
            Team countruCoach = coachs[i];
            if (countruCoach.getCountry().equals("Brazilia")) {
                System.out.println("Среди них найден бразилец");
                break;
            }

        }
        for (int i = coachs.length - 1; i >= 0; i--) {
            Team countruCoach = coachs[i];
            if (countruCoach.getCountry().equals("Russia")) {
                System.out.println("Все таки хоть один русский тренер есть. Это - " + countruCoach.toString()); // <------------- тут я наверно не совсем понял про toString
                break;
            }

        }
    }



}
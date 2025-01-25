package Player;

import java.util.Random;

public class ClubPlayer extends Player {
    @Override
    void inPlay() {
        System.out.println("Игрок команды вышел на поле");
    }

    public void randomAction() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                inPlay();
                break;
            case 1:
                outPlay();
                break;
            case 2:
                onSickLeave();
                break;
        }
    }

    public void outPlay() {


    }

    public void onSickLeave() {


    }
}

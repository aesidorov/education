package Player;

import java.util.Random;

public class OutstaffPlayer extends Player{
    @Override
    void inPlay() {
        System.out.println("Приглашённый игрок выходит последним на поле");
    }

    public void randomAction() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                inPlay();
                break;
            case 1:
                outOutstafPlay();
                break;
            case 2:
                outstaffOnSickLeave();
                break;
        }
    }

    public void outOutstafPlay() {


    }

    public void outstaffOnSickLeave() {


    }
}

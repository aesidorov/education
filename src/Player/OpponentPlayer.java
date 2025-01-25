package Player;

import java.util.Random;

public class OpponentPlayer extends Player{
    @Override
    void inPlay() {
        System.out.println("Оппонент вышел на поле");
    }

    public void randomAction() {

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                inPlay();
                break;
            case 1:
                outOpponentPlay();
                break;
            case 2:
                opponentOnSickLeave();
                break;
        }
    }

    public void outOpponentPlay() {


    }

    public void opponentOnSickLeave() {


    }
}

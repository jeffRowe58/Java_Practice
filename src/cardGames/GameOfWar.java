package cardGames;

import java.util.Arrays;

public class GameOfWar {
    public static void main(String[] args) {
        Card round = new Card();
        CardsArray deal = new CardsArray();


        Player computer1 = new Player();
        computer1.setGamesWon(0);
        computer1.setName("Steve");

        Player computer2 = new Player();
        computer2.setGamesWon(0);
        computer2.setName("Frank");

       // System.out.println(Card.getAllCards());
    }
}

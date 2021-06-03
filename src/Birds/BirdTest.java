package Birds;

import Birds.Duck;
import Birds.Finch;

public class BirdTest {
    public static void main(String[] args) {
//        Birds.Bird cardinal = new Birds.Bird();
//        cardinal.setName("Cardinal");
//        cardinal.setCanFly(true);
//        cardinal.makeNoise();
//        cardinal.move();
//    }

        Duck mallard                                 =                 new Duck();
        // declare a reference variable    assignment operator         call the default constructor
        mallard.setName("Mallard");
        mallard.makeNoise();

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser Goldfinch");
        lesserGoldFinch.makeNoise();

        Penguin penguin = new Penguin();
        penguin.setName("Emperor Penguin");
        penguin.setCanFly(false);
        penguin.move();
        penguin.makeNoise();


    }
}

import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {

        int[] numbers = {14, 64, 34, 44};
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] topFiveBoyNames = new String[5];

        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Wilbur";
        topFiveBoyNames[3] = "Alex";
        topFiveBoyNames[4] = "Yogi";

        for(int i = 0; i < topFiveBoyNames.length; i++){
            Arrays.fill(topFiveBoyNames, "jeff");
            System.out.println(topFiveBoyNames[i]);
        }
        int[] unsortedNightmare = {99, -19, 88, 0, 3, 44, 13};
        Arrays.sort(unsortedNightmare);
        System.out.println(Arrays.toString(unsortedNightmare));

        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        for(char[] row : letters) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for(char n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
            }
        System.out.println("+---+---+---+");
        }


    }


import java.util.Arrays;

public class HomeDepot {

    public static int getUniqueCharacter(String s) {
        String[] string = s.split("");
        int res = 0;
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (!string[i].equals(string[j])) {
                    res = i;
                }
            }

        }
        if(res > 0){
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        HomeDepot homeDepot = new HomeDepot();
        System.out.println(homeDepot.getUniqueCharacter("hackthegame"));

    }
}

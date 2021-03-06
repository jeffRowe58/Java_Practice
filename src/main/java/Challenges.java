import java.net.Proxy;
import java.util.Arrays;
import java.util.HashMap;

public class Challenges {
    public boolean hasEnglish(String val){
        String lower = val.toLowerCase();
        if(lower.contains("english")){
            return true;
        }else{
            return false;
        }
    }

    public int[] returnInt(int[] nums){
        int count = 0;
        int sum = 0;
        int[] results = {};
        if(nums == null){
            return results;
        }
        for(int i : nums){
            if(i > 0){
                count++;
            }else if(i < 0){
                sum += i;
            }
            results = new int[]{count, sum};
        }
        return results;
    }

    public int[] indices(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    static String encryptedMessage = "seaside the to sent be to ne2ds army ten of team a";

    public String decryptMessage(String message){
        String[] stringArray = message.split(" ");

        String temp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length -1];
        stringArray[stringArray.length - 1] = temp;

        String str = String.join(" ", stringArray);

        System.out.println(str);

        return str;

    }

    public static void typeCounter(String sentence){
        String[] strArray = sentence.split(" ");
        for(int i = 0; i < strArray.length; i++){


        }
    }



    //immuteable class

    final class immutable{
        final private int age = 40;
        final private String name = "Jeff";
    }

    public static boolean isRotation(String str1, String str2){
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }

     static class TenMinWalk {
         public static boolean isValid(char[] walk) {
             // Insert brilliant code here
             int north = 0;
             int south = 0;
             int east = 0;
             int west = 0;

             if (walk.length != 10) {
                 return false;
             } else {
                 for (char i : walk) {
                     switch (i) {
                         case 'n':
                             north += 1;
                             break;
                         case 's':
                             south += 1;
                             break;
                         case 'e':
                             east += 1;
                             break;
                         case 'w':
                             west += 1;
                             break;
                     }
                 }
                 System.out.printf("%d, %d, %d, %d", north, south, east, west);
                 if (north == 0 && south == 0) {
                     return walk.length == 10 && east % west == 0;
                 } else if (east == 0 & west == 0) {
                     return walk.length == 10 && north % south == 0;
                 } else {
                     return walk.length == 10 && north % south == 0 && east % west == 0;
                 }
             }
         }
     }

    public static void main(String[] args) {
        TenMinWalk tenMinWalk = new TenMinWalk();
        Challenges challenges = new Challenges();

        System.out.println(tenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));

//        System.out.println(challenges.hasEnglish("FaagdnglishAGG"));
//        System.out.println(challenges.hasEnglish("SMFENgliSHasnD"));
//        System.out.println(Arrays.toString(challenges.returnInt(new int[]{1, -6, 5, 4, 3, -7, -10, 201, -3})));
//        System.out.println(Arrays.toString(challenges.returnInt(null)));
//        System.out.println(Arrays.toString(challenges.indices(new int[]{1, 4, 8, 12}, 20)));
//
//        System.out.println(challenges.decryptMessage(encryptedMessage));
//        System.out.println(tenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
//        System.out.println(tenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
//        System.out.println("apple".compareTo("banana"));
//        System.out.println(challenges.isRotation("abcd", "bcda"));
//        System.out.println(challenges.isRotation("jeffreyrowe", "effreyrowej"));
//        System.out.println(challenges.isRotation("abcde", "bcdaf"));
    }
}

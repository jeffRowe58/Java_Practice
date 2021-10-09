package Java_Puzzles.prereq_practice.practice;

//before 7 and after 20

public class StringsPractice {
    public static void main(String[] args) {
        System.out.println(dogTrouble(true, 6));
        System.out.println(dogTrouble(true, 7));
        System.out.println(dogTrouble(false, 6));
        System.out.println(dogTrouble(true, 19));
        System.out.println(dogTrouble(true, 21));
        System.out.println(dogTrouble(false, 22));

    }
    public static boolean dogTrouble(boolean barking, int hour){
        return (barking && (hour < 7 || hour > 20));
        }
    }


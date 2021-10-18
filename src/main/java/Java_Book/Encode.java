package Java_Book;

import java.util.Scanner;

public class Encode {
    private static int key = 88;;
    static String msg = "";
    static String encmsg = "";
    static String decmsg = "";

    public static int getKey(){
        return Encode.key;
    }


    //encode the message
    public static void encode(String msg) {
        for (int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ getKey());
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your message");
        msg = sc.nextLine();
        encode(msg);
        System.out.print("Original message: ");
        System.out.println(msg);
        System.out.print("Encoded message: ");
        System.out.println(encmsg);

    }

}

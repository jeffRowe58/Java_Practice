package Java_Book;

import static Java_Book.Encode.*;

public class Decode {
    public static String decode(String msg){
        for(int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char) (msg.charAt(i) ^ getKey());
        return decmsg;
    }
    public static void main(String[] args) {
        System.out.print("Encoded message: ");
        System.out.println(encmsg);
        decode(encmsg);
        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }

}

import java.util.Scanner;

public class ExceptionStudy {
    public String maybeAnInteger = "42";
    public String definitelyNotAnInteger = "I am a String";

//    public void askForAnInteger(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Pleaaaase enter an integer");
//        String userin = sc.next();
//        try{
//            int userInInteger = Integer.parseInt(userin);
//            System.out.println("The integer in your string is: " + userInInteger);
//        }catch (NumberFormatException nfe){
//            System.out.println("There is no integer.");
//        }finally {
//            System.out.println("Thank you for using our app.");
//        }
//    }
    public void multiCatch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleaaaase enter an integer");
        String userIn = sc.next();
        try{
            int userInput = Integer.parseInt(userIn, 10, 15, 10);
        }catch(NumberFormatException nfe){
            System.out.println("No integer between characters 10 and 15");
        }catch (IndexOutOfBoundsException iobe){
            System.out.println("Your string wasn't long enough");
        }finally {
            System.out.println("This is useful isn't it.");
        }
    }
}

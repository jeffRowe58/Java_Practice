package Java_Book;

import java.util.Scanner;

public class Java_Practice {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moonWeight = 0;
        double moonGravity = .166;
        double userWeight = 0;
        System.out.println("Enter your weight to see what you would weigh on the moon.");
        userWeight = sc.nextInt();
        moonWeight = userWeight * moonGravity;
        System.out.printf("Your moon weight is %.2f\n", moonWeight);

        double inches, meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++){
            meters = inches / 39.37; //convert to liters
            System.out.printf("%.2f inch(es) is %.2f meter.\n", inches, meters);

            counter++;
            //every 10th line, print a blank line
            if(counter == 12){
                System.out.println();
                counter = 0; // reset the counter
            }
        }

    }
}
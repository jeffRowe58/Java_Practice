import java.util.Scanner;

public class Invene {
    public int add(int one, int two) {
        return one + two;
    }

    public int add(int one, int two, int three) {
        return one + two + three;
    }

    public int subtract(int one, int two) {
        return one - two;
    }

    public int multiply(int one, int two) {
        return one * two;
    }

    public float divide(int one, int two) throws ArithmeticException {
        try {
            float result = one / two;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Zero cannot divide any number");
        }
        return 0;
    }

    public void math() {
        Scanner sc = new Scanner(System.in);
        boolean repeat = false;
        do {
            System.out.println();
            System.out.println("Please select a one of the following");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            int method = sc.nextInt();
            System.out.println("Please enter your first number");
            int one = sc.nextInt();
            System.out.println("Please enter your second number");
            int two = sc.nextInt();
            switch (method) {
                case 1:
                    System.out.println(one + two);
                    break;
                case 2:
                    System.out.println(one - two);
                    break;
                case 3:
                    System.out.println(one * two);
                    break;
                case 4:
                    System.out.println(one / two);
                    break;
            }
            System.out.println("Would you like to do another math operation?");
            if (sc.next().toLowerCase().equals("yes") || sc.next().toLowerCase().equals("y")) {
                repeat = true;
            } else if((sc.next().toLowerCase().equals("no") || sc.next().toLowerCase().equals("n"))) {
                repeat = false;
            }
        } while (repeat) ;
    }


    public static void main(String[] args) {
        Invene invene = new Invene();
//        System.out.println(invene.add(4, 99));
//        System.out.println(invene.add(4,5, 56));
//        invene.divide(12, 0);
        invene.math();


    }
}

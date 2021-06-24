package ControlFlowStatements.Switch.ForStatement;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

//        for(init; termination(exit); increment)

        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " Hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for
        (int i = 10; i < 50; i++)
        {
            if(isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count==3){
                    System.out.println("Exiting for loop");
                    break;
            }


        }

            int count2 = 0;
            for
            (int j = 10; j < 50; j++) {
                if (isPrime2(j)) {
                    count2++;
                    System.out.println("Number " + j + " is a prime number");
                    if (count2 == 10) {
                        System.out.println("Looping");
                        break;
                    }


                }
            }
    }
}

//    Challenge

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int m) {

        if (m == 1) {
            return false;
        }

        for (int j = 2; j<= (long) Math.sqrt(m); j++) {
            System.out.println("Looping " + j);
            if (m % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount*(interestRate/100));
    }
}

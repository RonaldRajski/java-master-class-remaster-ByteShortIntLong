package Questions;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;

//        Loop for 100 iterations
        for(int i=1; i<=n; i++){

            if(i%15 == 0)
                System.out.println("Fizzbuzz");

            else if(i % 5 == 0 )
                System.out.println("Buzz"+" ");

            else if(i % 3 ==0)
                System.out.println("Fizz"+" ");
            else System.out.println(i+" ");
        }

    }
}

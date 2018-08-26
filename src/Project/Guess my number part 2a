package Project;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void Main(String[]args) {
        Scanner S = new Scanner(System.in);
        Random r = new Random();

        int guess = 0;
        int answer = r.nextInt( 10);
        boolean win = false;

        while (!win){
            System.out.println("enter guess 0-10");
            guess= S.nextInt();
            if (guess ==answer) {
                win=true;
            }

            if (guess<answer){
                System.out.println("too low");
            }
            if (guess>answer){
                System.out.println("too high");
            }
        }
        System.out.println("You Win!");
    }
}

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







package Project;


        import java.util.Random;
        import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int upperLimit=100;
        int lowerLimit = 1;
        String myAnswer = "";

        do{
            randNum = rand.nextInt (bound: upperLimit - lowerLimit+1)/2;
            system.out.println("I think its's"=randNum);
           myAnswer = in.nextLine();

           if (myAnswer.equals("too low")){
               lowerLimit= randNum +1;
           } else if (myAnswer.equals("too high")){
           upperLimit = randNum - 1;}
} while (!myAnswer.equals("yes"));
in.close(
;
System.out.println("You guessed my number!")
}
}
}
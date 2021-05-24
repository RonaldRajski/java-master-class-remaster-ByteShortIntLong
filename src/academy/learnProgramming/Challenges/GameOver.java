package academy.learnProgramming.Challenges;

public class GameOver {

    public static void main(String[] args) {

        boolean gameOver = true;
//        int score = 4000;
//        int levelCompleted = 4;
//        int bonus = 100;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;


//        if(score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but but greater than 1000");
//        }
//        else if (score < 1000){
//            System.out.println("Your score was less that 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }



        if (gameOver) {
            int finalScore  = score + (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);
        }

//        int savedFinalScore = finalScore;

//        boolean newGameOver =  true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;

//        if (gameOver) {
//            int finalScore  = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }

    }
}

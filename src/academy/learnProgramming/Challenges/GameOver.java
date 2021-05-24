package academy.learnProgramming.Challenges;

public class GameOver {

    public static void main(String[] args) {



        calculateScore(true, 800, 5, 100);
        calculateScore(true, 1000, 8, 200);

    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus) + 2000;
            System.out.println("Your final score was " + finalScore);
        }


    }
}

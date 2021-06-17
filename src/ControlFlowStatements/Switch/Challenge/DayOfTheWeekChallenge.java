package ControlFlowStatements.Switch.Challenge;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {


        int dayOfTheWeek = 2;
        switch (dayOfTheWeek){
            case 0:
                System.out.println("Monday, Monday Oh what a day");
                break;

            case 2:
                System.out.println("Monday's Younger brother");
                break;

            case 3:
                System.out.println("Hump day!");
                break;

            case 4:
                System.out.println("One day until Friday");
                break;

            case 5:
                System.out.println("I'm not even supposed to be here today");
                break;

            default:
                System.out.println("Welcome to the weekend!");
                break;
        }
    }
}

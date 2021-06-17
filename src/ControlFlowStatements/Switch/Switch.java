package ControlFlowStatements.Switch;

import com.sun.jdi.Value;

import java.util.Locale;

public class Switch {
    public static void main(String[] args) {
//        int value = 1;
//        if (value ==1){
//            System.out.println("Value was 1");
//        }
//        else if(value == 2){
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3,4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char grade = 'F';
        switch (grade){
            case 'A':
                System.out.println("Grade was an A");
                break;

            case 'B':
                System.out.println("Grade was a B");
                break;

            case 'C': case 'D':
                System.out.println("Was a C or D");
                System.out.println("Actually it was a " + grade);
                break;

            default:
                System.out.println("Like the Playoff chances of the 2021 Chicago BlackHawks, An F is a failing grade");
                break;
        }

        String dayOfTheWeek = "Sunday";
        switch (dayOfTheWeek.toLowerCase()){
            case "Monday":
                System.out.println("Monday, Monday Oh what a day");
                break;

            case "Tuesday":
                System.out.println("Monday's Younger brother");
                break;

            case "Wednesday":
                System.out.println("Hump day!");
                break;

            case "Thursday":
                System.out.println("One day until Friday");
                break;

            case "Friday":
                System.out.println("I'm not even supposed to be here today");
                break;

                default:
                System.out.println("Welcome to the weekend!");
                break;
        }


    }
}

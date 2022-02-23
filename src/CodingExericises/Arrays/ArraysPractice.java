package CodingExericises.Arrays;
import java.util.Scanner;

public class ArraysPractice {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);


    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] =scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[]array){
        for(int i = 0; i< array.length; i++){
            System.out.println("Element " + i + "contents " + array[i]);
        }
    }

    public static in[] sortInteger(int[array]){
        int sortedArray = new int[arry.length];


    }

}
//        public static int countEven(int[] arr){
//            int count = 0;
//            for (int num : arr) {
//                if (num % 2 == 0) {
//                    count++;
//
//                    return count;
//                }
//            }
//
//        }
//    }
//}
//        int[] myIntArray = new int[25];
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//
//        }
////        for (int i = 0; i < myIntArray.length; i++){
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//
//        printArray(myIntArray);
//    }


    //    Create an array using a method
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element " + i + ", value is " + array[i]);
//
//        }
//    }
//    Return the number of even integers in array arr of integers




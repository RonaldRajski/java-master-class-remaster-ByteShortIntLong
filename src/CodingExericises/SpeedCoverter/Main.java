package CodingExericises.SpeedCoverter;

public class Main {
    public static void main(String[] args) {
        double miles = SpeedCoverter.toMilesPerHour(10.5);
        System.out.println("Miles " + miles);

        SpeedCoverter.printConversion(10.5);
    }
}

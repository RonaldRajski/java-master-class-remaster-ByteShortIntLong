package CodingExericises.MethodOverload.SecondsAndMinutes;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65L,45L));
        System.out.println(getDurationString(3945L));

    }
    private static String getDurationString(long minutes, long seconds){
        if((minutes<0) || (seconds < 0) || (seconds> 59)){
            System.out.println("Invalid value");
        }
        long hours = minutes/60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours <10){
            hoursString = "0" + hoursString;
        }
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }




}



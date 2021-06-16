package CodingExericises.MinutesToYearsDaysCalculator;


    public class MinutesToYearsDaysCalculator {
        private static final String INVALID_MESSAGE = "Invalid Value";

        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println(INVALID_MESSAGE);
            } else {
                long years = (minutes / 60) / 24 / 365;
                long days = (minutes / 60) / 24 % 365;
                System.out.println(minutes + " statmin = " + years + " y and " + days + " d");
            }
        }

        }



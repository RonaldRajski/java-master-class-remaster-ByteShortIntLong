package CodingExericises.LeapYearCalculator;

public class LeapYearCalculator {

//    public static final int First_Leap_Year = 1752;
//
//    public boolean isLeapYear(int year){
//        if(year<First_Leap_Year){
//            throw new IllegalArgumentException("Cannot handle years before" + First_Leap_Year);
//        }
//        if(isDivisibleByOneHundred(year)){
//            if(!isDivisbleByOneHundred(year)){
//                return true;
//            }
//            else {
//                return isDivisibleByFourHundre(year);
//            }
//            else{
//                return false;
//            }
//        }
//
//        private boolean isDivisibleByFour(int year){
//            return new Number(year).isDivisbleBy(4);
//        }
//        private boolean isDivisibleByOneHundred(int year){
//            return new Number(year).isDivisbleBy(100);
//        }
//        private boolean isDivisibleByFourHundred(int year){
//            return new Number(year).isDivisbleBy(400);
//    }
//
//}


    public static final int FIRST_LEAP_YEAR = 1752;

    public boolean isLeapYear(int year) {
        if (year<FIRST_LEAP_YEAR) {
            throw new IllegalArgumentException("Cannot handle years before " + FIRST_LEAP_YEAR);
        }
        if (isDivisibleByFour(year)) {
            //noinspection SimplifiableIfStatement
            if (!isDivisibleByOneHundred(year)) {
                return true;
            }  else {
                return isDivisibleByFourHundred(year);
            }
        } else {
            return false;
        }
    }

    private boolean isDivisibleByFour(int year) {
        return new Number(year).isDivisibleBy(4);
    }

    private boolean isDivisibleByOneHundred(int year) {
        return new Number(year).isDivisibleBy(100);
    }

    private boolean isDivisibleByFourHundred(int year) {
        return new Number(year).isDivisibleBy(400);
    }
}

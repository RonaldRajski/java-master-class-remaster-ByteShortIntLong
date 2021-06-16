package CodingExericises.PlayingCat;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,33));
    }

    public static boolean isCatPlaying(boolean b, int i) {
        if ((b==true)&&(i>=25 && i<=45)){
            return true;
        }
        else if ((b==false) && (i>=25 && i<=35)){
            return true;
        }
        else {
            return false;
        }
    }
}

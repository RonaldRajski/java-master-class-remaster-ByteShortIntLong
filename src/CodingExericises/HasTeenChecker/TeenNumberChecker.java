package CodingExericises.HasTeenChecker;

public class TeenNumberChecker {
    public static boolean hasTeen(int i, int i1, int i2){
        if((i>=13 && i<=19) || (i1>=13 && i1<=19)|| (i2>=13 && i2<=19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int a){
        if(a>=13 || a<=19){
            return true;
        }
        return false;
    }


}

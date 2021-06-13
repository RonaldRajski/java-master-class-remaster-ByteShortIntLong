package CodingExericises.MethodOverload.AreaCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(8.5d));
        System.out.println(area(3.24d,-1.43d));
    }

        public static double area ( double v){
            if (v < 0) {
                return -1.0;
            } else {
                return Math.PI * v * v;
            }
        }
        public static double area ( double v, double v1){
            if (v < 0 || v1 < 0)
                return -1.0;
            else
                return v * v1;


    }
}

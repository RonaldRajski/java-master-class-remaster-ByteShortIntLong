package Questions;


import java.util.HashSet;
import java.util.Set;

public class Rectangle {

//    function to find minimum area of Rectangle
    public static int minAreaRectangle (int[][] points){

//        create empty columns
//                @SuppressWarnings("unchecked")
        Set<Integer> columns = new HashSet<>();

// fill columns with coordinates
        for (int[] point : points)
            columns.add(40001 * point[0] + point[1]);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; ++i)
            for (int j = i + 1; j < points.length; ++j) {
                if (points[i][0] != points[j][0]
                        && points[i][1] != points[j][1]) {
                    if (columns.contains(40001
                            * points[i][0]
                            + points[j][1])
                            && columns.contains(
                            40001 * points[j][0]
                                    + points[i][1])) {
                        ans = Math.min( ans, Math.abs(points[j][0]
                                - points[i][0])
                                * Math.abs(points[j][1]
                                - points[i][1]));
                    }
                }
            }

        return ans < Integer.MAX_VALUE ? ans : 0;
    }

//    Driver code

    public static void main(String[] args) {

        int[][] A = {{1,1}, {1,3}, {3,1}, {3,3}, {2,2}};
        System.out.println(minAreaRectangle(A));

    }


}

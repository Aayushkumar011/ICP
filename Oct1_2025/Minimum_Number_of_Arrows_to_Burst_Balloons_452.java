import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons_452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int c=1;
        int end = points[0][1];
        for(int[] arr : points){
            if(end<arr[0]){
                c++;
                end=arr[1];
            }
        }
        return c;
    }
}

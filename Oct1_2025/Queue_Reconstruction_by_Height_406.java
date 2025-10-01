import java.util.ArrayList;
import java.util.Arrays;

public class Queue_Reconstruction_by_Height_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i=0;i<people.length;i++){
            arr.add(people[i][1],new int[]{people[i][0],people[i][1]});
        }
        return arr.toArray(new int[people.length][2]);
    }
}

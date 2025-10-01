import java.util.Arrays;

public class Boats_to_Save_People_881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i=0,j=n-1;
        int c=0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                c++;
                i++;
                j--;
            }
            else{
                c++;
                j--;
            }
        }
         return c;
    }
}

import java.util.*;
public class Sliding_Window_Maximum_239 {

    // BRUTE FORCE //

    // public static void maxSlidingWindow(int[] nums, int k, int[] arr) {
    //     int n = nums.length;
    //     int m = n-k+1;
    //     for(int i=0;i<m;i++){
    //         int max=Integer.MIN_VALUE;
    //         for(int j=i;j<k+i;j++){
    //             max=Math.max(max,nums[j]);
    //         }
    //         arr[i] = max;
    //     }
    // }



    // OPTIMAL //

    public static void maxSlidingWindow(int[] nums, int k, int[] arr) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() < i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                arr[i-k+1] = nums[dq.peekFirst()];
            }
        }
    }
    public static void main(String[] var0) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int n = nums.length;
        int m = n-k+1;
        int[] arr = new int[m];
        maxSlidingWindow(nums,k,arr);
        for(int i=0;i<m;i++){
            System.out.println(arr[i]);
        }
   }
}

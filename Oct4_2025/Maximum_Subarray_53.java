public class Maximum_Subarray_53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            msum=Math.max(msum,sum);
            if(sum<0)sum=0;
        }
        return msum;
    }
}

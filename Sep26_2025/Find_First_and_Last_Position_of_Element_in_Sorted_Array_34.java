import java.util.*;
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34{
    public static void searchRange(int[] nums, int target, int[] arr) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       
    }
    public static void main(String[] var0) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] arr = {-1,-1};
        searchRange(nums,target,arr);
        for(int i=0;i<2;i++){
            System.out.println(arr[i]);
        }
   }
}

import java.util.*;
class Merge_sorted_array_88{

    // USING EXTRA SPACE , EXTRA ARRAY FOR MERGING AND THEN COPY TO ORIGINAL

    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i=0,j=0,k=0;
    //     int[] arr = new int[m+n];
    //     while(i<m && j<n){
    //         if(nums1[i]<=nums2[j]){
    //             arr[k++]=nums1[i++];
    //         }
    //         else{
    //             arr[k++]=nums2[j++];
    //         }
    //     }
    //     while(i<m){
    //         arr[k++]=nums1[i++];
    //     }
    //     while(j<n){
    //         arr[k++]=nums2[j++];
    //     }
    //     k=0;
    //     for(int e:arr){
    //         nums1[k++]=e;
    //     }
    // }

    // WITHOUT USING EXTRA ARRAY 

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
        
    }
    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int m=3;
        int[] num2 = {2,5,6};
        int n=3;
        merge(num1,m,num2,n);
        for(int e:num1){
            System.out.println(e);
        }
    }
}
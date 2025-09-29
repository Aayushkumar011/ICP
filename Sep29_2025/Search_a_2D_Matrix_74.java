
public class Search_a_2D_Matrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;int j=m*n-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            int r = mid/m;
            int c = mid%m;
            if(matrix[r][c]==target)return true;
            else if(matrix[r][c]>target){
                j=mid-1;
            }
            else i=mid+1;
        }
        return false;
    }
}

public class Number_of_Islands_200 {
    void clear(char grid[][],int r,int c,int[][] a){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0')return;
        grid[r][c]='0';
        for(int i=0;i<4;i++){
            clear(grid,r+a[i][0],c+a[i][1],a);
        }
    }
    public int numIslands(char[][] grid) {
        int c = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] a = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    c++;
                clear(grid,i,j,a);
                }
            }
        }
        return c;
    }
}

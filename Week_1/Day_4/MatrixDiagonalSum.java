class Solution {
    public int diagonalSum(int[][] mat) {
        int r = mat.length; // Number of rows 
        int c = mat[0].length;
        int sum=0;
        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                sum=sum+mat[i][j];
                if((i+j)==r-1)
                sum+=mat[i][j];

            }
        }
        if(r%2!=0)
        sum=sum-mat[(r-1)/2][(c-1)/2];
        return sum;
    }
}

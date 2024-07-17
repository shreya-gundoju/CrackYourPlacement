class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int[] rarr = new int[r];
        Arrays.fill(rarr, 0);
        int[] carr = new int[c];
        Arrays.fill(carr, 0);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rarr[i]=1;
                    carr[j]=1;
                }
            }
        }
        for(int i = 0; i < r; ++i){
            for(int j = 0; j < c; ++j){
                if(rarr[i]==1 || carr[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

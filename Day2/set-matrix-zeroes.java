class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        boolean[] rarr = new boolean[r];
        boolean[] carr = new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rarr[i]=true;
                    carr[j]=true;
                }
            }
        }
        for(int i = 0; i < r; ++i){
            if(rarr[i]){
                for(int j = 0; j < c; ++j){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0; j < c; ++j){
            if(carr[j]){
                for(int i = 0; i < r; ++i){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

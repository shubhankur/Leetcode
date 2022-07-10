package Misc;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int l = 0, m =0;
        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(m<c) {
                    result[l][m++] = mat[i][j];
                }
                else{
                    m=0;l++;
                    if(l==c) return mat;
                    result[l][m++] = mat[i][j];
                }
            }
        }
        if(l==r-1)
        return result;
        else return mat;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2},{3,4}};
        int r = 4, c=1;
        int[][] result = matrixReshape(mat,r,c);
        for (int i =0;i< result.length;i++){
            for (int j = 0;j<result[i].length;j++){
                System.out.print(result[i][j]+" , ");
            }
            System.out.println();
        }
    }
}

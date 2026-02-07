import java.util.*;
public class Type1 {
    public static void main(String[] args) {
       int[][] matrix={
           {1,2,3},
           {4,5,6},
           {7,8,9}
       };
       rotate(matrix);
    }
    // Rotate Image LeetCode- 48
    public static void rotate(int[][] matrix) {
        // transpose of the matrix
        int n= matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<n; i++){
            int left=0, right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
    }
    for(int i=0; i<n; i++){
        System.out.println(Arrays.toString(matrix[i]));
}
    }
    // Spiral Matrix LeetCode- 54
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) return result;
        int m= matrix.length, n= matrix[0].length;
        int startRow=0, endRow=m-1, startCol=0, endCol=n-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol; i<=endCol; i++){
                result.add(matrix[startRow][i]);
            }
            startRow++;
            for(int i=startRow; i<=endRow; i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;
            if(startRow <= endRow){
                for(int i=endCol; i>=startCol; i--){
                    result.add(matrix[endRow][i]);
                }
                endRow--;
            }
            if(startCol <= endCol){
                for(int i=endRow; i>=startRow; i--){
                    result.add(matrix[i][startCol]);
                }
                startCol++;
            }

        }
        return result;
    }
    
}

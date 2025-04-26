// Problem Link: https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1

class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int row = 0, col = mat[0].length-1;
        
        while(row < mat.length && col >= 0){
            if(mat[row][col] == x){
                // System. out.println(x + " is present in the matrix.");
                return true;
            }
            
            else if(x < mat[row][col]){
                col--;
            }
            
            else if(x > mat[row][col]){
                row++;
            }
        }
        // System.out.println(x + " is not present in the matrix, so output is false.");
        return false;
    }
}

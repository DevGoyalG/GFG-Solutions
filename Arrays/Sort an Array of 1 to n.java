// Problem Link: https://www.geeksforgeeks.org/problems/sort-an-array-which-contains-1-to-n-values-using-mathematical-formula/1

class Solution {
    int[] sortArray(int arr[]) {
            // Arrays.sort(arr);
            // return arr;
            for(int i=0; i<arr.length; i++){
                arr[i]=i+1;
            }
            return arr;
    }
}

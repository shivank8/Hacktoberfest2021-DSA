// Q.Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.
// Example 1:
// Input: 
// N = 4 , M = 4
// Arr[][] = {{0, 1, 1, 1},
//           {0, 0, 1, 1},
//           {1, 1, 1, 1},
//           {0, 0, 0, 0}}
// Output: 2
// Explanation: Row 2 contains 4 1's (0-based indexing).

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax(arr, n, m);
            System.out.println(ans);
        }
    }
}

class Solution {
    int rowWithMax(int a[][], int n, int m) {
        // code here
        int i=0,j=m-1,max=-1;
        while(i<n && j>=0){
            if(a[i][j]==1){
                max=i;
                j--;
            }else
            i++;
        }
            
       return max; 
    }
}

// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        
        if(n==0)
         return 0;
         
        if(n==1)
         return arr[0];
         
        if(n==2)
         return Math.max(arr[0], arr[1]);
         
        int inc=arr[0];
        int exc=0;
        int curr=0;
        
        for(int i=1;i<n;i++)
        {
            curr= Math.max(inc , exc);
            inc=exc+arr[i];
            exc=curr;
        }
        return Math.max(inc , exc);
    }
}

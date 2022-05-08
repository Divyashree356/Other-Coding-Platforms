// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[])
    {
        int[] dp=new int[size];
        dp[0]= 1;  //if 0 elements lie h to zero hi sequence ki length hogi
        int max=0;
        for(int i=1;i<size;i++)
        {
            int currMax=0;
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    if(currMax<dp[j])
                       currMax=dp[j];
                }
            }
            dp[i]=currMax+1;
            
            if(max<dp[i])
             max=dp[i];
        }
        return max;
    }
} 

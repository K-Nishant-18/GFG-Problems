//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; ++i) arr[i] = sc.nextInt();

            System.out.println(new Sol().search(n, arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Sol {
    public static int search(int n, int arr[]) {
        int result=0;
        if(n==1){
            result=arr[0];
        }else{
            for(int i=0; i<n-1; i=i+2){
                result=arr[n-1];
                int WS=arr[i];
                int WE=arr[i+1];
                if(WS!=WE){
                    return result=WS; 
                }
            }
        }
        return result;
    }
}



/* 
### Approach 2: XOR-Based Optimized Solution

class Sol {
    public static int search(int n, int arr[]) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR operation
        }
        return result;
    }
}

*/

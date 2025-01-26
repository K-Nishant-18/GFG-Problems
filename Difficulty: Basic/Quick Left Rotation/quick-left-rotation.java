//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution {
    
    void reverse(int[] arr, int i, int j){
        int temp=0;
        for(int k=i; k<j; k++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    
    
    void leftRotate(int arr[], int k) {
        
        int n=arr.length;
        k%=n;
        
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(a1[i]));
            }
            int k = Integer.parseInt(br.readLine());
            Solution ob = new Solution();

            ob.leftRotate(arr, k);
            for (int i = 0; i < arr.length; i++) out.print(arr[i] + " ");
            out.println();
        
out.println("~");
}
        out.close();
    }
}

// } Driver Code Ends
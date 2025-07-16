//{ Driver Code Starts
// Initial Template for Java
// import java.io.*;
// import java.util.*;

// class GFG {
//     public static void main(String args[]) throws IOException {
//         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(read.readLine());
//         while (t-- > 0) {
//             int n = Integer.parseInt(read.readLine());
//             Solution ob = new Solution();
//             boolean flag = ob.armstrongNumber(n);
//             if (flag) {
//                 System.out.println("true");

//             } else {
//                 System.out.println("false");
//             }

//             System.out.println("~");
//         }
//     }
// }
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev+(ld*ld*ld);
            n=n/10;
        }
        return (temp==rev);
    }
}



//For Generalized Armstrong number use this-
class Solution {
    static boolean armstrongNumber(int n) {
        int temp=n;
        int temp2=n;
        int count=countDigit(temp);
        int sum=0;
        
        while(temp2!=0){
            int digit=temp2%10;
            sum=sum+ (int)Math.pow(digit, count);
            temp2=temp2/10;
        }
        
        if(sum==n){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static int countDigit(int temp){
        int m=0;
        while(temp!=0){
            temp=temp/10;
            m++;
        }
        return m;
    }
}

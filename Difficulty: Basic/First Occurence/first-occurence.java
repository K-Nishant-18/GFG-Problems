//{ Driver Code Starts
import java.util.*;

class Implement_strstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String line = sc.nextLine();
            String a = line.split(" ")[0];
            line = sc.nextLine();
            String b = line.split(" ")[0];

            Solution g = new Solution();
            System.out.println(g.firstOccurence(a, b));

            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to locate the occurrence of the string x in the string s.
    int firstOccurence(String txt, String pat) {
        // Your code here
        int n = txt.length();
        int m = pat.length();
        
        int i = 0;
        
        while(i+m <= n){
            if(txt.substring(i, i+m).equals(pat)){
                return i;
            }
            
            i++;
        }
        
        return -1;
    }
}

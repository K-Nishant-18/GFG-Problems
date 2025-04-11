//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        
         s1=s1.replaceAll("\\s+","");
         s2=s2.replaceAll("\\s+","");

        int n1=s1.length();
        int n2=s2.length();
        
        if(n1!=n2)
        return false;
        
        int[] count=new int[26];
        
        for(char ch:s1.toCharArray()){
            count[ch-'a']++;
        }
        
        for(char ch:s2.toCharArray()){
            count[ch-'a']--;
            if(count[ch-'a']<0)
            return false;
        }
        return true;
    }
}
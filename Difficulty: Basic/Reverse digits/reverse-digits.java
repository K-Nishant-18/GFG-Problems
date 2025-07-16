// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int rev=0;
        int digit;
        
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        
        return rev;
    }
}
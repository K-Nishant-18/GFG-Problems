// User function Template for Java

class Solution {
    static long kthDigit(int a, int b, int k) {
        long digit=0;
        long num=(long)Math.pow(a,b);
        
        while(k!=0){
            digit=num%10;
            num=num/10;
            k--;
        }
        
        return digit;
    }
}
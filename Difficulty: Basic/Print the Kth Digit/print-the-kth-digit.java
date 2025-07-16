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


//Better Solution
// • Always prefer fastPower()->[Binary Exponentiation] over Math.pow() When working with large exponents

class Solution {
    static long kthDigit(int a, int b, int k) {
        long digit=0;
        long num=fastPower(a,b);
        
        while(k!=0){
            digit=num%10;
            num=num/10;
            k--;
        }
        
        return digit;
    }
    
    static long fastPower(int a, int b) {
        long ans = 1;
        long base = a;
        while (b > 0) {
            if(b%2==1) {
                ans = ans*base;
                b--;
            }else{
                base = base*base;
                b = b/2;
            }
        }
        
        return ans;
    }
    
}

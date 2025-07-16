class Solution {
    static int sumOfDigits(int n) {
        int sum=0;
        int digit;
        
        while(n!=0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        
        return sum;
    }
}

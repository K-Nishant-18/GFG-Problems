class Solution {
    static int factorial(int n) {
        // code here
        int res=1;
        for(int i=1; i<=n; i++){
            res*=i;
        }
        return res;
    }
}
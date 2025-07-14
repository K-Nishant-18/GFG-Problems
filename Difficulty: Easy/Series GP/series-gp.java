class Solution {
    public int nthTerm(int a, int r, int n) {
        int MOD=1000000007;
        long result=(long)a*r;
        for(int i=3; i<=n; i++){
            result=(result*r)%MOD;
        }
        return (int)result;
    }
}
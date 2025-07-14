class Solution {
    public ArrayList<Integer> printPat(int n) {
        int m=n;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=n; i>0; i--){
            for(int j=n; j>0; j--){
                for (int k = 0; k < i; k++){
                    a.add(j);
                }
            }
            a.add(-1);
        }
        return (a);
    }
    
}
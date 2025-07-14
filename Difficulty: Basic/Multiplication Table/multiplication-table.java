// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            arr.add(n*(i+1));
        }
        return (arr);
    }
}
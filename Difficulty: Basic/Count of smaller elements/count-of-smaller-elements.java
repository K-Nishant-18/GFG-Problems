
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        
        int n=arr.size();
        int count=0;
        for(int i=0; i<n; i++){
            if(arr.get(i)<=x)
            count++;
        }
        
        return count;
    }
}
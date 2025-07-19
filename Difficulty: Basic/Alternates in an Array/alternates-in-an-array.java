class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        
        ArrayList<Integer> newArr=new ArrayList<Integer>();
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(i%2==0)
                newArr.add(arr[i]);
        }
        
        return (newArr);
    }
}
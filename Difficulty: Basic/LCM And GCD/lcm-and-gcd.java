class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        
        int larger = (a > b) ? a : b;
        int smaller = (a < b) ? a : b;
        int[] arr=new int[2];
        
        int max=larger*smaller;
        int temp=larger;
        int temp2=smaller;
        int LCM=findLCM(temp, max, larger, smaller);
        int GCD=findGCD(temp2, larger, smaller);
        arr[0]=LCM;
        arr[1]=GCD;
        
        return arr;
    }
    
    public static int findLCM(int temp, int max, int larger, int smaller){
        while(temp<=max){
            if(temp%smaller==0){
                return temp;
            }else{
                temp=temp+larger;
            }
        }
        return -1;
    }
    
    public static int findGCD(int temp2, int larger, int smaller){
        while(temp2>=1){
            if(larger%temp2==0 && smaller%temp2==0){
                return temp2;
            }else{
                temp2=temp2-1;
            }
        }
        return -1;
    }
}
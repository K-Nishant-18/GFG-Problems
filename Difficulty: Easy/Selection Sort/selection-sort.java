//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String arr[] = br.readLine().split(" ");
            int a[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                a[i] = Integer.parseInt(arr[i]);
            }

            Solution obj = new Solution();
            obj.selectionSort(a);

            IntArray.print(a);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    void selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int min=i;
            int temp;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                } 
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}

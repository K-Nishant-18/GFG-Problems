//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class DeleteNode {
    Node head;

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            String[] s = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }

            int x = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            Node ans = ob.deleteNode(head, x);

            while (ans != null) {
                System.out.print(ans.data + " ");
                ans = ans.next;
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        Node temp=head;
        
        if(x==1){
            head=head.next;
            return head;
        }
        int count=1;
        while(temp!=null){
            if(count==x-1){   
                temp.next=temp.next.next;
                break;
            }
        temp=temp.next;
        count++;
        }
        return head;
    }
}


/*

class Solution {
    Node deleteNode(Node head, int x) {
        // Edge case: If the list is empty
        if (head == null) return null;

        // If the node to be deleted is the head
        if (x == 1) {
            return head.next;
        }

        Node temp = head;
        for (int i = 1; i < x - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // Delete the node if it's valid
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}


*/

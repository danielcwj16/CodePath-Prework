/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

import java.util.*;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
 }
public class Subtract {

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
;
        Subtract sl = new Subtract();
        ListNode r = sl.subtract(n1);
        while(r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }
	public ListNode subtract(ListNode a) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ListNode p1 = a;
        ListNode p2 = a;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if(p2 != null && p2.next == null){
            p1 = p1.next;
        }
        while(p1 != null){
            arr.add(p1.val);
            p1 = p1.next;
        }
        p1 = a;

        for(int i=arr.size()-1;i>=0;i--){
            p1.val = arr.get(i)-p1.val;
            p1 = p1.next;
        }

        return a;
	}
}
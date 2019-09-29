package forpat;

public class 删除链表倒数第n个数据 {
	
     public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	 
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	    	ListNode f=new ListNode(0),s=new ListNode(0);
	    	f.next=head;
	    	s.next=head;
	        for(int i=0;f.next!=null;i++) {
	        	if(i>=n) {
	        	f=f.next;
	        	s=s.next;
	        	}
	        	else f=f.next;
	        }
	        if(s.next==head) {
	        	head=head.next;
	        }
	        else s.next=s.next.next;
	        return head;
	    }
	}
	
}

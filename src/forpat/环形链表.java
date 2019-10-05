package forpat;

public class ª∑–Œ¡¥±Ì {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
   public boolean hasCycle(ListNode head) {
	   if(head==null||head.next==null)return false;
	   ListNode fast=new ListNode(0);
	   ListNode slow=new ListNode(0);
	   fast=head;
	   slow.next=head;
	   while(fast!=null) {
		   if(fast==slow)return true;
		   fast=fast.next.next;
		   slow=slow.next;
	   }
	   return false;
    }
}

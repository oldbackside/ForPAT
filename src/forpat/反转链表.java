package forpat;

public class ·´×ªÁ´±í {
	public class ListNode {
			      int val;
			      ListNode next;
			      ListNode(int x) { val = x; }
			 }
	public ListNode reverseList(ListNode head) {
		
        ListNode n=head;
        ListNode l=null;
        ListNode r=null;
        ListNode m=null;
        while(n!=null){
            if(n.next==null){
                n.next=l;
                return n;
            }
        m=n.next;
        r=n.next.next;
        n.next.next=n;
        n.next=l;
        l=m;
        n=r;
        }
        return l;
        
    }
}

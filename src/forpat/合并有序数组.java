package forpat;

public class 合并有序数组 {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode f,s,t;
       if(l1==null&&l2!=null) return l2;
       if(l1!=null&&l2==null) return l1;
		 ListNode rul=new ListNode(0);
		 t=rul;
		 f=l1;
		 s=l2;
       
	        while(f!=null&&s!=null) {
	        	if(f.val>s.val) {
	        		t.next=s;
	        		t=t.next;
	        	    s=s.next;
	        	}
	        	else {
	        		t.next=f;
	        		t=t.next;
	        	    f=f.next;
	        	}
	        }
	        if(f!=null) {
	        	t.next=f;
	        }
	        else t.next=s;
	        return rul.next;
	 }
}

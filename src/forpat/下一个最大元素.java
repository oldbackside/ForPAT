package forpat;

import java.util.HashMap;
import java.util.Map;

public class 下一个最大元素 {
	 public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
	     Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	     for(int i=0;i<nums1.length;i++) {
	    	 m.put(nums1[i],null);
	     }
	     int i=0;
	     while(m.containsValue(null)) {
	    	 if(m.containsKey(nums2[i])) {
	    		 int r=0;
	    		 for(int t=i;t<nums2.length;t++) {
	    			 if(nums2[t]>nums2[i]) {
	    				 m.replace(nums2[i], nums2[t]);
	    				 r=1;
	    				 break;
	    			 }
	    		 }
	    		 if(r==0) {
	    		 m.replace(nums2[i], -1);
	    		 }
	    	 }
	     i++;
	     }
	     int[] a=new int[nums1.length];
	     for(int q=0;q<nums1.length;q++) {
	    	 a[q]=m.get(nums1[q]);
	     }
	 return a;
	 }
	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        int map[]=new int[10];
	        int res[]=new int [nums1.length];
	        int stack[]=new int [nums2.length],top=-1;//栈 通过移动游标实现进出栈
	        for(int i=0;i<nums2.length;i++){
	            map[nums2[i]]=-1; //map记录O（n）的记录 空间换时间
	            while(top!=-1 && nums2[i]>nums2[stack[top]]){ //
	                map[nums2[stack[top--]]]=nums2[i];
	            }
	            stack[++top]=i;
	        }
	        for(int i=0;i<nums1.length;i++){
	            res[i]=map[nums1[i]];

	        }
	        return res;
	    }
	 public static void main(String[] args) {
		int[] a= {4,1,2};
		int[] b= {1,3,4,2};
		下一个最大元素 h=new 下一个最大元素();
		int[] d=h.nextGreaterElement(a, b);
		
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
}

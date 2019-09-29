package forpat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 四数之和 {
	public List<List<Integer>> fourSum(int[] nums,int target) {
	       Arrays.sort(nums);
	       List<List<Integer>> ls = new ArrayList<>();
	       if(nums.length<4) return ls;
	       for(int a=0;a<nums.length-3;a++) {
	    	  if(a == 0 || (a > 0 && nums[a] != nums[a - 1])) {
	    	   for(int b=a+1;b<nums.length-2;b++) {
	    		   if(b== a+1 || (nums[b] != nums[b - 1])) {
	    		   int c=b+1;
	    		   int d=nums.length-1;
	    	    while(c<d) {
	    	    	int sum=nums[a]+nums[b]+nums[c]+nums[d];
	    	    	if(sum==target) {
	    	    		 ls.add(Arrays.asList(nums[a], nums[b], nums[c],nums[d]));
	    	    		  while(c<d&&nums[c]==nums[c+1]) c++;
	    	      		while(c<d&&nums[d]==nums[d-1]) d--;
	    	    		 c++;
	    	    		 d--;
	    	    	}
	    	    	else if(sum<target) {
	    	    	    //  while(c<d&&nums[c]==nums[c+1]) c++;没有
	    	    	     c++;
	    	    	}
	    	    	else {
	    	    	//	while(c<d&&nums[d]==nums[d-1]) d--;
	    	    		d--;
	    	    	}
	    	    }
	    		   }
	    	   }
	       }
	    	  }
	       return ls;
	   }
}

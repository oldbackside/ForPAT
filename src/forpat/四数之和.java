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
	    		   int c=a+1;
	    		   if(c==b)c++;
	    		   int d=nums.length-1;
	    	    while(c<d) {
	    	    	int t=target-nums[a]+nums[b];
	    	    	if(nums[c]+nums[d]==target) {
	    	    		 ls.add(Arrays.asList(nums[a], nums[b], nums[c],nums[d]));
	    	    		  while(nums[c]==nums[c+1]&&c!=a&&c<d) {c++;
	    	    		  if(c==nums.length-1)break;
	    	    		  }
	    	      		while(nums[d]==nums[d-1]&&d!=a&&c<d) {d--;
	    	      		if(d==0) break;
	    	      		}
	    	    		 c++;
	    	    		 d--;
	    	    	}
	    	    	else if(t<0) {
	    	    	     while(nums[c]==nums[c+1]&&c!=a&&c<d) {c++;
	    	    	     if(c==nums.length-1)break;
	    	    	     }
	    	    	     c++;
	    	    	}
	    	    	else {
	    	    		while(nums[d]==nums[d-1]&&d!=a&&c<d) {d--;
	    	    		if(d==0)break;
	    	    		}
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

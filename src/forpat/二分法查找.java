package forpat;

public class 二分法查找 {
    public int search(int[] nums, int target) {
    	int l=0;
    	int r=nums.length-1;
    	if(nums[l]==target) {
    		return l;
    	}
    	if(nums[r]==target) {
    		return r;
    	}
        while(l<r) {
        	int mid=l+(r-l)/2;
        	if(nums[mid]==target)return mid;
        	if(nums[l]==target)return l;
        	if(nums[r]==target)return r;
        	else if(nums[mid]>target) {
        		r=mid-1;
        	}
        	else l=mid+1;
        }
        return -1;
        
    }
    public static void main(String[] args) {
    	二分法查找 j=new 二分法查找();
		int[] a= {1,4,5,6,15,16,30,100};
		System.out.println(j.search(a, 20));
	}
    
}

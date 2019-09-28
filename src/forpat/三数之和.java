package forpat;

import java.util.*;

public class 三数之和 {
	public void merge(int []a,int left,int mid,int right){
        int []tmp=new int[a.length];
        int p1=left,p2=mid+1,k=left;

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }
        while(p1<=mid) tmp[k++]=a[p1++];
        while(p2<=right) tmp[k++]=a[p2++];

        for (int i = left; i <=right; i++) 
            a[i]=tmp[i];
    }

    public void mergeSort(int [] a,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }


	//***********************************************************************************
	public static void quickSort(int[] a, int n) {
        quickSortRecursive(a, 0, n - 1);
    }
    public static void quickSortRecursive(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(a, p, r);
        quickSortRecursive(a, p, q - 1);
        quickSortRecursive(a, q + 1, r);
    }
    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++;
            }
        }
        int t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }
    public static int findzero(int[] a){
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>=0) return i;
    	}
    	return a.length;
    }
    //垃圾超时代码
   public List<List<Integer>> threeSum(int[] nums) {
	   Map<Integer,Integer> map=new HashMap<Integer,Integer>();
   	   List<List<Integer>> rul=new ArrayList<List<Integer>>();
	   if(nums.length==0) return rul;
       int l;
       int r;
       mergeSort(nums,0,nums.length-1); 
       for(int i=0;i<nums.length;i++) {
		   map.put(i, nums[i]);
	   }
       int zero=findzero(nums);
       l=0;
       r=nums.length-1;
       if(nums[r]<0||nums[l]>0) return rul;
       else if(nums[r]==nums[l]) {rul.add(new ArrayList<Integer>(Arrays.asList(0,0,0))); return rul;}
       else {
       	while(l<=zero) {
       		r=nums.length-1;
       		if(l==0) {
       			while(r>=zero) {
       				if((2*nums[l]+nums[r])>0) {r--;continue;}
       				int m=0-nums[r]-nums[l];
       				if(m<=nums[r]&&m>=nums[l]) {
       				map.remove(r, nums[r]);
       				map.remove(l, nums[l]);
       				if(map.containsValue(m)) {
                        rul.add(new ArrayList<Integer>(Arrays.asList(nums[l],m,nums[r])));
       				}
       				map.put(r, nums[r]);
       				map.put(l, nums[l]);
       				}
       				while(r>=zero) {
       					if(r>0){
       	       			    r--;
       	       			    if(nums[r]==nums[r+1]) continue;
       	       			    else break;
       	                    }
       	                    else r--;
       				}
       			}
       			l++;
       		}
       		else if(nums[l]!=nums[l-1]) {
       			while(r>=zero) {
       				if((2*nums[l]+nums[r])>0) {r--;continue;}
       				int m=0-nums[r]-nums[l];
       				if(m<=nums[r]&&m>=nums[l]) {
       				map.remove(r, nums[r]);
       				map.remove(l, nums[l]);
       				if(map.containsValue(m)) {
                        rul.add(new ArrayList<Integer>(Arrays.asList(nums[l],m,nums[r])));
       				}
       				map.put(r, nums[r]);
       				map.put(l, nums[l]);
       				}
       				while(r>=zero) {
       					if(r>0){
       	       			    r--;
       	       			    if(nums[r]==nums[r+1]) continue;
       	       			    else break;
       	                    }
       	                    else r--;
       				}
       			}
       			l++;
       	    }
       		else l++;
       			
       	}
       }
       return rul;
   }
   //正确代码
   public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> ls = new ArrayList<>();

       for (int i = 0; i < nums.length - 2; i++) {
           if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案

               int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
               while (l < r) {
                   if (nums[l] + nums[r] == sum) {
                       ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                       while (l < r && nums[l] == nums[l + 1]) l++;
                       while (l < r && nums[r] == nums[r - 1]) r--;
                       l++;
                       r--;
                   } else if (nums[l] + nums[r] < sum) {
                       while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
                       l++;
                   } else {
                       while (l < r && nums[r] == nums[r - 1]) r--;
                       r--;
                   }
               }
           }
       }
       return ls;
   }
   public static void main(String[] args) {
	int[] t=new int[] {0,1,1};
	三数之和 i=new 三数之和();
	List<List<Integer>> u=i.threeSum(t);
	System.out.println("ok");
}
}

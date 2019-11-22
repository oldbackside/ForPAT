package forpat;

public class 查找第k个元素 {
	//第k大
    public int findk(int[] s,int k,int b,int e) {
    	if(b==e) return s[e];
    	int g=part(s,b,e);
    	if(g+1==k) return s[g];
    	else if(g+1>k) return findk(s,k,b,g-1);
    	else return findk(s,k,g+1,e);
    }
    public int part(int[] s,int b,int e) {
    	if(b+1==e) {
    		if(s[b]>s[e]) {
    			int em=s[b];
    			s[b]=s[e];
    			s[e]=em;
    		}	
    		return e;
    	}
    	int l=b;
    	int r=e-1;
    	int tem=s[e];
    	
    	while(l<r) {
    		if(s[l]>tem&&s[r]<=tem) {
    			s[e]=s[l];
    			s[l]=s[r];
    			s[r]=s[e];
    		}
    		if(s[l]<tem) l++;
    		if(s[r]>tem)r--;
    	}
    	s[e]=s[l];
    	s[l]=tem;
    	return l;
    }
    public static void main(String[] args) {
		int[] s= {2,5,1,6,23,6,88,4};
		查找第k个元素 t=new 查找第k个元素();
		System.out.println(t.findk(s,2,0,s.length-1));
	}
}

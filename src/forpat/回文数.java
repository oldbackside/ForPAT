package forpat;

import java.util.ArrayList;
import java.util.List;

public class ������ {
    public boolean isPalindrome(int x) {
    	if(x<0)return false;
    	if(x<10)return true;
    	List<Integer> array=new ArrayList<Integer>();
    	while(x>0) {
    		array.add(x%10);
    		x=x/10;
    	}
    	while(array.size()>=2) {
    		if(array.remove(0)==array.remove(array.size()-1))continue;
    		else return false;
    	}
    	return true;
        
    }
    public static void main(String[] args) {
		������ h=new ������();
		if(h.isPalindrome(121)) {
		System.out.println("ok");
		}
		int a=2369;
		String t=a+"";//���԰�intת���ַ�������������
		char[] c=t.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
}

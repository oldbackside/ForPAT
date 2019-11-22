package forpat;

import java.util.Stack;

public class 有退格的数组比较 {
	 public boolean backspaceCompare(String S, String T) {
	        char[] s=S.toCharArray();
	        char[] t=T.toCharArray();
	        Stack<Character> l=new Stack<Character>();
	        Stack<Character> r=new Stack<Character>();
	        int i=0;
	        for(;i<s.length&&i<t.length;i++) {
	        	if(s[i]!='#') {
	        		l.add(s[i]);
	        	}
	        	else if(l.size()!=0)l.pop();
	        	if(t[i]!='#') {
	        		r.add(t[i]);
	        	}
	        	else if(r.size()!=0)r.pop();
	        }
	        if(i<s.length) {
	        	for(;i<s.length;i++) {
	        		if(s[i]!='#') {
		        		l.add(s[i]);
		        	}
		        	else if(l.size()!=0)l.pop();
	        	}
	        }
	        else {
	        	for(;i<t.length;i++) {
	        	if(t[i]!='#') {
	        		r.add(t[i]);
	        	}
	        	else if(r.size()!=0)r.pop();
	        	}
	        }
	        if(l.size()!=r.size())return false;
	        else {
	        	while(!l.isEmpty()) {
	        	if(l.pop()!=r.pop()) return false;
	            }
	        	return true;
	        }
	    }
}

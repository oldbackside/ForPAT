package forpat;

import java.util.Stack;

public class ÓÐÐ§À¨ºÅ {
    public boolean isValid(String s) {
    	if(s==null)return true;
        Stack<Character> S=new Stack<Character>();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++) {
        	if(c[i]=='('||c[i]==')'||c[i]=='{'||c[i]=='}'||c[i]=='['||c[i]==']') {
        		if(S.isEmpty())S.push(c[i]);
        		else if(c[i]==S.peek()+1&&c[i]==S.peek()+2)S.pop();
        		else S.push(c[i]);
        	}
        }
        if(S.isEmpty())return true;
        else return false;
    }
}

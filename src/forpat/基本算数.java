package forpat;

import java.util.Stack;

public class 基本算数 {
    public int calculate(String s) {
        Stack<Integer> b=new Stack<Integer>();
        Stack<Character> c=new Stack<Character>();
        int o=0;
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++) {	
        	if(a[i]==' ')continue;
        	else if(a[i]=='+') {
        		c.add(a[i]);	
        	}
        	else if(a[i]=='-') {
        		c.add(a[i]);
        	}
        	else if(a[i]=='(') {
        		o++;
            }
        	else if(a[i]==')') {
        		if(!c.isEmpty()) b.add(evaluate(b.pop(),c.pop(),b.pop()));
        	}
        	else {
        		int r=a[i]-48;
        		while(48<=a[i+1]&&a[i+1]<58) {r=r*10+(a[i+1]-48);i++;}
        		b.add(r);
        	    if(!c.isEmpty()&&o==0) {
        			b.add(evaluate(b.pop(),c.pop(),b.pop()));
        		}
        	    else if(o>0)o--;
        	
            }
       }
        return b.pop();
    }
    public int evaluate(int a,char b,int c) {
    	if(b=='+')return a+c;
    	else return c-a;
    }
    public static void main(String[] args) {
	    String s="90-(5+2)";
	    基本算数 j=new 基本算数();
	  int q=1;
	    System.out.println((char)(q+48));
	   System.out.println( j.calculate(s));
	    
	}
}


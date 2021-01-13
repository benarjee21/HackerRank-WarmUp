package com.study.sloved.warmup;

public class KangarooHacker {
	
	 static String kangaroo(int x1, int v1, int x2, int v2) {
	        if(v1>v2 && (x2-x1)%(v1-v2)==0){
	            return "YES";
	        }
	        return "NO";
	    }

	public static void main(String[] args) {
		int x1=1,v1=2,x2=2,v2=1;
		System.out.println(KangarooHacker.kangaroo(x1,v1,x2,v2));

	}

}

package com.study.sloved.warmup;

public class AppleOrangeHacker {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int aCount=0,bCount=0;
		for(int i = 0; i< apples.length; i++) {
			if(s<= apples[i]+a && apples[i]+a <=t) {
				aCount++;
			}
		}
		for(int j = 0; j< oranges.length; j++) {
			if(s<= oranges[j]+b && oranges[j]+b <=t) {
				bCount++;
			}
		}
		System.out.println(aCount);
		System.out.println(bCount);
    }

	public static void main(String[] args) {
		int s=7,t=10,a=4,b=12; int[] apples= {2,3,-4},oranges= {3,-2,-4};
		AppleOrangeHacker.countApplesAndOranges(s,t, a, b, apples, oranges);

	}

}

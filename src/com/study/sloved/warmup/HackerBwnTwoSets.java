package com.study.sloved.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HackerBwnTwoSets {
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int count=0;
		Set<Integer> c = new HashSet<Integer>();
		Collections.sort(a);
		Collections.sort(b);
		int srtPoint = a.get(0);
		int endPoint = b.get(b.size()-1);
		for(int i=srtPoint;i<=endPoint;i++) {
			int aCount=0;
		    for(int j=0;j<a.size();j++) {
		    	if(i%a.get(j)==0) {
		    		aCount++;
		    	}
		    	if(aCount==a.size()) {
		    		c.add(i);
		    	}
		    }
		}
		//System.out.println(c.size());
		for(int i=srtPoint;i<=endPoint;i++) {
			int bCount=0;
		    for(int j=0;j<b.size();j++) {
		    	if(b.get(j)%i==0) {
		    		bCount++;
		    	}
		    	if(bCount==b.size() && c.contains(i)) {
		    		count++;
		    	}
		    }
		}
	    return count;

	}

	public static void main(String[] args) {
		List<Integer> a= new ArrayList<Integer>();
		List<Integer> b= new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		System.out.println(HackerBwnTwoSets.getTotalX(a,b));
	}

}

package com.study.sloved.warmup;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class DiagonalDiffHacker {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	       int fistD=0,secD=0;List<Integer> innerL;
	       for (int i=0;i<arr.size();i++) {
	           innerL = arr.get(i);
	           fistD += innerL.get(i);
	       }
	       innerL=null;
	       for (int i=arr.size()-1,j=0;i>=0;i--,j++) {
	           innerL = arr.get(j);
	           secD += innerL.get(i);
	       }
	        return Math.abs(fistD-secD);
	    }

	public static void main(String[] args) {
		List<List<Integer>> arrl = new ArrayList<List<Integer>>();
		List<Integer> r1 = new ArrayList<Integer>();
		List<Integer> r2 = new ArrayList<Integer>();
		List<Integer> r3 = new ArrayList<Integer>();
		r1.add(21);
		r1.add(11);
		r1.add(10);
		r2.add(13);
		r2.add(12);
		r2.add(14);
		r3.add(21);
		r3.add(22);
		r3.add(5);
		arrl.add(r1);
		arrl.add(r2);
		arrl.add(r3);
		System.out.println(DiagonalDiffHacker.diagonalDifference(arrl));
	}

}

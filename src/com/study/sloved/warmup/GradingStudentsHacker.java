package com.study.sloved.warmup;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentsHacker {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
			
		for(int i=0;i<grades.size();i++) {
			Integer x = grades.get(i);
			for(int j=0;j<3 && x>=38;j++) {
				if((x+j)%5==0) {
					grades.set(i, x+j);
					j = j+2;
				}
			}
				

		}
		return grades;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		Integer[] arr1 = {44,
				84,
				94,
				21,
				0,
				18,
				100,
				18,
				62,
				30,
				61,
				53,
				0,
				43,
				2,
				29,
				53,
				61,
				40,
				14,
				4,
				29,
				98,
				37,
				23,
				46,
				9,
				79,
				62,
				20,
				38,
				51,
				99,
				59,
				47,
				4,
				86,
				61,
				68,
				17,
				45,
				6,
				1,
				95,
				95};
		for(Integer ar : arr1) {
			arr.add(ar);
		}
		arr=GradingStudentsHacker.gradingStudents(arr);
		for(Integer ar : arr) {
			System.out.println(ar);
		}
	}

}

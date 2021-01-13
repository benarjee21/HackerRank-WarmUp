package com.study.sloved.warmup;

import java.util.Arrays;

public class BirthdayCandles {
	private static void candlesCount(int[] arr, int a) {
		Arrays.sort(arr);
		int max = arr[arr.length-1],count=0;
		for (int i=0;i<a;i++) {
			if(arr[i]==max)
				count++;
		}
		System.out.println(count);
	}

public static void main(String[] args) {
	int[] arr = {7,6,2,4,7};
	int a=5;
	BirthdayCandles.candlesCount(arr,a);
 }
}


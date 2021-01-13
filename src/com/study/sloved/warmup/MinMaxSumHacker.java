package com.study.sloved.warmup;

//import java.util.Arrays;

public class MinMaxSumHacker {
	
	//Best solution
	static void miniMaxSum(int[] arr) {
        int sum=0,min=0,max=0;
        min=arr[0];
        max=min;
        sum=min;
        for(int i=1;i<arr.length;i++) {
        	sum += arr[i];
        	if(arr[i]<min)
        		min = arr[i];
        	if(arr[i]>max)
        		max=arr[i];
        }
        System.out.println((sum-max)+" "+(sum-min));

    }

	
	
//	static void miniMaxSum(int[] arr) {
//        long mSum=1,mWSum=0,miWSum=0,miSum=Integer.MAX_VALUE;
//        int mStt=0,miStt=0,k=4,len=arr.length;
//        Arrays.sort(arr);
//        for(int i=0;i<len;i++){
//        	 mWSum += arr[i];
//            if(i>k-2){
//              mSum = Math.max(mSum,mWSum);
//              mWSum -= arr[mStt];
//              mStt++;
//            }
//           
//        }
//        for(int i=0;i<len;i++){
//        	miWSum += arr[i];
//            if(i>k-2){
//              miSum = Math.min(miSum,miWSum);
//              miWSum -= arr[mStt];
//              mStt++;
//            }
//           
//        }
//        System.out.println(miSum+" "+mSum);
//
//    }


	public static void main(String[] args) {
		int[] arr = {7,69,2,221,8974};
		MinMaxSumHacker.miniMaxSum(arr);
	}

}

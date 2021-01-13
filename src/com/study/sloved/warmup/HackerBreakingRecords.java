package com.study.sloved.warmup;

public class HackerBreakingRecords {
	
	static int[] breakingRecords(int[] scores) {
		int highBreak = scores[0],lowBreak = scores[0],currentScore=0,highCount = 0,lowCount = 0;
		for(int i=0;i<scores.length;i++) {
			currentScore = scores[i];
			if(currentScore>highBreak) {
				highBreak=currentScore;
				highCount++;
			}
				
			if(currentScore<lowBreak) {
				lowBreak = currentScore;
				lowCount++;
			}
				
		}
		return new int[] {highCount,lowCount};

    }

	public static void main(String[] args) {
		int[] scores = {3,4,21,36,10,28,35,5,24,42}; 
		int[] breaks= HackerBreakingRecords.breakingRecords(scores);
		for(int a : breaks) {
			System.out.println(a);
		}
	}

}

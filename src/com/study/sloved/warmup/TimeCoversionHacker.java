package com.study.sloved.warmup;

public class TimeCoversionHacker {
	
	//Best Answer
	static String timeConversion(String s) {
		String ns="";
		String[] tSts=s.split(":");
		int hr = Integer.parseInt(tSts[0]);
		String min = tSts[1];
		String sec = tSts[2].substring(0, tSts[2].length()-2);
		String period = tSts[2].substring(tSts[2].length()-2,tSts[2].length());
		if((0<=hr && hr<12) && (period.equalsIgnoreCase("AM"))) {
			ns=String.format("%02d", hr)+":"+min+":"+sec;
		}else if((0<=hr && hr<12) && (period.equalsIgnoreCase("PM"))) {
			ns=(12+hr)+":"+min+":"+sec;
		}else if((hr==12) && (period.equalsIgnoreCase("PM"))) {
			ns=hr+":"+min+":"+sec;
		}else if((hr==12) && (period.equalsIgnoreCase("AM"))) {
			ns="00"+":"+min+":"+sec;
		}
		return ns;
	}
	
	
	
	
	
	
	//MY SOLUTION--------------------------
	
//	static String timeConversion(String s) {
//		String ns;
//		int hrs = Integer.parseInt(s.substring(0,2));
//		String ses = s.substring(s.length()-2,s.length());
//		StringBuilder sb = new StringBuilder();
//		StringBuilder sb1=sb.append(s);
//		sb1.delete(s.length()-2, s.length());
//		if(ses.equalsIgnoreCase("PM") && hrs!=12) {
//			sb1.replace(0, 2, String.valueOf(hrs+12));
//		}
//		if(ses.equalsIgnoreCase("AM") && hrs==12) {
//			sb1.replace(0, 2, String.valueOf(hrs-12));
//		}
//		ns = sb1.toString();
//		return ns;
//	}

	public static void main(String[] args) {
		String s = "12:45:00PM";
		//rough work
//		StringBuilder sb = new StringBuilder();
//		StringBuilder sb1=sb.append(s);
//		System.out.println(sb1);
//		sb1.replace(0, 2, "00");
//		System.out.println(sb1);
//		sb1.delete(s.length()-2, s.length());
//		System.out.println(sb1);
		
		System.out.println(TimeCoversionHacker.timeConversion(s));
	}

}

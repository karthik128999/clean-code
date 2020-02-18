package com.interest;

public class house {
	public static long cost(String st,int area,String auto)
	{
		if(st=="standard")
			return (area*1200);
		if(st=="above_standard")
			return (area*1500);
		if(st=="high_standard" && auto=="no")
			return (area*1800);
		if(st=="high_standard" && auto=="yes")
			return (area*2500);
		return 0;
	}
}

package com.interest;

public class house {
	public static long cost(String str,int totalarea,String auto)
	{
		if(str=="standard")
			return (totalarea*1200);
		if(str=="above_standard")
			return (totalarea*1500);
		if(str=="high_standard" && auto=="no")
			return (totalarea*1800);
		if(str=="high_standard" && auto=="yes")
			return (totalarea*2500);
		return 0;
	}
}

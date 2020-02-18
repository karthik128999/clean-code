package com.interest;

public class interest {
public static double simple(double principal,double time,double rate)
{
	return (principal * time * rate)/100;
}
public static double compound(double principal,double time,double rate)
{
	return principal * Math.pow(1.0+rate/100.0,time) - principal;
}
}

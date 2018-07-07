package com.enums;

public class abc 
{
 public static void main(String[] args) {
	String s1 =new String("a");
	String s2=s1.concat("b");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1==s2);
	s2.concat("c");
	System.out.println(s2);
	StringBuffer sb1=new StringBuffer("a");
	StringBuffer sb2=sb1.append("b");
	System.out.println(sb1);
	System.out.println(sb2);
	System.out.println(sb1==sb2);
 sb2.append("c");
 System.out.println(sb2);
 }
}

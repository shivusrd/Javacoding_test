package stringsCoding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;  
public class CountChar {
	
	public static void main(String[] args) {
	
	// Java Program to count the total number of characters in a string
	int c=0;
	String str="Hi I am back";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ')
			c++;
	
	}
	System.out.print(c);
	char ch[]=str.toCharArray();
	System.out.print(ch.length);
	
	//using stream
	
	long cn=str.chars().filter(e->(char)e!=' ').count();
	System.out.print(cn);

	// anagram strings
		String s1="Brag";
		String s2="Grab";
		/*
		 * s1=s1.toLowerCase(); s2=s2.toLowerCase(); char[] ch1=s1.toCharArray(); char[]
		 * ch2=s2.toCharArray(); if(s1.length()!=s2.length()) {
		 * System.out.println("not anagram string"); } Arrays.sort(ch1);
		 * Arrays.sort(ch2); if(Arrays.equals(ch1, ch2)==true) {
		 * System.out.println("anagram string"); }
		 */
			//anagram using stream
			
	String st1= Stream.of(s1.split("")).map(s->s.toLowerCase()).sorted().collect(Collectors.joining());
	String st2= Stream.of(s2.split("")).map(s->s.toLowerCase()).sorted().collect(Collectors.joining());
	if(st1.equals(st2))
		System.out.println("ana");
	
	//substrings
	String ss="tanisha";
	String sub="ni";
	for(int l=0;l<ss.length();l++) {
		for(int m=l+1;m<=ss.length();m++) {
			System.out.println(ss.substring(l,m));
		}
		
	}
	
		
	}
	
   
}
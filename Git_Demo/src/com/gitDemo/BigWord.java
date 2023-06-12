package com.gitDemo;
import java.util.Scanner;
public class BigWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner x=new Scanner(System.in);
		
      System.out.println("***************************");

		System.out.println("Enter the String:");
		String s=x.nextLine();
		
		String s1[]=s.split(" ");
		int max=0;
		int i;
		String s2=null;
		
		for(i=0;i<s1.length;i++)
		{
			if(s1[i].length()>max)
			{
				max=s1[i].length();
				s2=s1[i];
			}
		}
		
		System.out.println("Biggest word is:"+s2);
		

	}

}

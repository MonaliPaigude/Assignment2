package JavaProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
	
		System.out.println("Enter the String :");
		
		Scanner scr=new Scanner(System.in);
		String original=scr.nextLine();
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--) {
			
			reverse=reverse+original.charAt(i);
			}
		
		if(original.equals(reverse)) {
			
			System.out.println("String is Palindrome");
			
			}
		else {
			System.out.println("String is not Palindrome");
			
		}
	}

}

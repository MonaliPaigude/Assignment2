package JavaProgram;

import java.util.Scanner;

public class arrayascending {

	public static void main(String[] args) {
		
		
		System.out.println("Sort array in ascending order:");
		System.out.println("\n----------------\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements");
		
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int temp=0;
		System.out.println("Enter all elements");
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" element of the array:");
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1;j<n;j++)
				
			{ if(a[i]>a[j])
			{
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			}
			}
		}
		
		System.out.println("**************************");
		System.out.println("Sorted element in ascending order:");
		System.out.println("**************************");
		
		for(int i=0; i<n; i++) {
			
			System.out.println(a[i] + "");
		}
	}

}

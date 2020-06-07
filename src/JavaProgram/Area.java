package JavaProgram;

import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class Area implements Shapes {

	public static void main(String[] args) {
		
		
		Area a=new Area();
		a.AreaSquare();
		a.AreaCircle();
		a.AreaTriangle();
		

	}
	
	public void AreaSquare() {
		int a=20;
		int area=a*a;
		System.out.println("Area of Square is" +area);
	}
	
	public void AreaCircle() {
		double area,radius;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of the Circle");
		radius=input.nextDouble();
		//input.close();
		area= Math.PI*radius*radius;
		System.out.println("Area of Circle is" +area);
		
	}
	
	public void AreaTriangle()  {
		double base;
		double htg;
		double area;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter base of triangle :");
		base=scr.nextDouble();
		System.out.println("Enter height of triangle :");
		htg=scr.nextDouble();

		area=(base*htg)/2;
		System.out.println("The are of Triangle is : "  +area);

	}

}
		

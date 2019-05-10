package practisegit;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter radius");
		
		int r = SC.nextInt();
		double pie = 3.42;
		double Area = pie*r*r;
		
		System.out.println("Area is : " + Area);

	}

}

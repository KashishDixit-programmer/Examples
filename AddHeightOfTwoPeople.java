package day02;

import java.util.Scanner;

public class AddHeightOfTwoPeople {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Height of first person");
			double height1 =sc.nextInt();
			System.out.println("Enter Enter Height of second  person");
			double height2 =sc.nextInt();
			double result=height1+height2;
			System.out.println("The sum of height of two person is"+" "+result);

	}

}

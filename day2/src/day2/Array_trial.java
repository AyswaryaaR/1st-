package day2;

import java.util.Scanner;
public class Array_trial {
	int i=0;	
	int num[];
	void accept()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter the values of array");
		num=new int[n];
		
	}
	int great()
	{
		int large=0;
		for(i=0;i<num.length;i++)
		{
			if(num[i]>large)
			{
				large=num[i];				
			}
		}
		return large;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array largest=new array();
		System.out.println(largest.great());

	}

}

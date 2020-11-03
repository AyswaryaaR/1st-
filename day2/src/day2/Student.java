package day2;
import java.util.*;

public class Student {
	static int i=0;
	int stud_mark[];
	int s[];
	int accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the values of array");
		stud_mark=new int[n];
		for(int i:stud_mark)
		{
			s[i]=stud_mark[i];
		}
		return(s[i]);
		
	}
	void display()
	{
		System.out.println(stud_mark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud[]=new Student[10];
		stud[i].accept();
		stud[i].display();
		
	}

}

package day2;

public class array {
	int i=0;	
	int num[]= {2,45,6,78};
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

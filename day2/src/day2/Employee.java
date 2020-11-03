package day2;

public class Employee {
	int empno;
	String empname;
	/*employee(int eno,String ename)
	{
		empno=125;
		empname="ays";
	}*/
	void accept(int empno,String empname )
	{
		this.empno=empno;
		this.empname=empname;
	}
	void display()
	{
		System.out.println("Employee no: "+empno);
		System.out.println("Employee name: "+empname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.accept(Integer.parseInt(args[0]),args[1]);
		emp.display();
	}

}

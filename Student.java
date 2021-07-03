package array;

public class Student {

	
	int rno , marks; // instance variable , object variable 
	
	Student(int r , int m)
	{
		rno = r;
		marks=m;
	}
	
	
	public String toString()
	{
		return " roll  Number is " + rno + " Marks is " + marks;
	}
}

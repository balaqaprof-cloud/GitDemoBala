package javahandson;

public class MethodOverLoading {
	public static void main(String args[]) {
		int total = add(10,20);
		System.out.println("total is "+total);
		int total3 = add(10,20,30);
		System.out.println("total3 is "+total3);
	}



public static int add(int a,int b)
{
	return (a+b);
	}  
public static int add(int a,int b,int c){return a+b+c;}	

}
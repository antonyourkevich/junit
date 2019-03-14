package test;

public class Main {

	public static void main(String[] args) {
		
int age =4;
try

{	System.out.println(age/0);
}catch(
	ArithmeticException ex)
	{
		System.out.println("arithmeticexception caught");
	}

	}

}

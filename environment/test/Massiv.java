package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Massiv {

	int age = 5;
	String name = "Anton";

	
	@Ignore
	@Test(expected=ArithmeticException.class)
	public int method1() {
		System.out.println("1 method");
		return age;

	}

	@Test

	public int method2() {
		assertEquals(4, 2, 0.01);
		System.out.println("2 method");
		return age;

	}
@BeforeClass
	public int method3() {
		assertTrue(4+ 2 ==6);
		System.out.println("3 method");
		return age;

	}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(int i, int j, double d) {
		// TODO Auto-generated method stub
		
	}
@After
	public int method4() {
		assertFalse(4+ 2 ==7);
		System.out.println("4 method");
		return age;

	}
@AfterClass
public int method5()
{ 
	
System.out.println("5 method");
return age;

}


}






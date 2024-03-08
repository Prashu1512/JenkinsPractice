package testNGProject;

import org.testng.annotations.Test;

public class Sample2Test 
{
	@Test(groups = "smoke")
	public void tso3test()
	{
		System.out.println("----Test script03----");
	}
	@Test(groups = "regression")
	public void tso4test()
	{
		System.out.println("----Test script04----");
	}
}

package jenkinsProject;

import org.testng.annotations.Test;

public class Sample1Test 
{
@Test(groups = "smoke")
public void tso1test()
{
	System.out.println("----Test script01----");
}
@Test(groups = "regression")
public void tso2test()
{
	System.out.println("----Test script02----");
}

}

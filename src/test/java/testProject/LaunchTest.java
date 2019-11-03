package testProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.BaseTest;

public class LaunchTest extends BaseTest{
	
	@BeforeTest
	
	public void LaunchTest() throws IOException
	{
		driver=InitializeDriver();
	}
	@Test
	public void HomeTest()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	driver.findElement(By.className("level0 ")).click();
	ValidateMenu vm=new ValidateMenu();
	vm.getValidation(driver);
	
      
	}
	@AfterTest
	public void Logout()
	{
		driver.close();
	}
	

}

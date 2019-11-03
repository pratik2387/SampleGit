package testProject;

import java.nio.file.Files;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ValidateMenu {
public ValidateMenu()
{
	
}

public void getValidation(WebDriver driver)
{
	System.out.println("Title after clicking on Mobile menu:"+" "+driver.getTitle());
	WebElement x=driver.findElement(By.cssSelector("select"));
	Select s1=new Select(x);
	s1.selectByVisibleText("Name");	
	WebElement e1=driver.findElement(By.cssSelector("span.price"));
	String p=e1.getText();
	System.out.println("The price of Sony Experia mobile is : " + p);
	driver.findElement(By.cssSelector("img#product-collection-image-1")).click();

	System.out.println("After navigating to details page of Sony Experia:");
System.out.println(driver.findElement(By.cssSelector("div.product-shop")).getText());
CartAdditionTest ca=new CartAdditionTest();
ca.AddCart(driver);

}
}

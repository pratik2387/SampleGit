package testProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartAdditionTest {
public void AddCart(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("button.button.btn-cart")).click();
	System.out.println(driver.findElement(By.cssSelector("li.success-msg")).getText());
	WebElement x=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input"));
	x.clear();
	Actions act=new Actions(driver);
	act.moveToElement(x).sendKeys("1000").build().perform();
	
	driver.findElement(By.cssSelector("button.button.btn-update")).click();
	String a=driver.findElement(By.cssSelector("p.item-msg.error")).getText();
	System.out.println(a);
driver.findElement(By.cssSelector("button#empty_cart_button.button2.btn-empty")).click();
System.out.println(driver.findElement(By.cssSelector("div.page-title")).getText());


			}
}

	


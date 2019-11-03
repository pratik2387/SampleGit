package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver InitializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Selenium\\Maven\\EcommerceProject\\src\\main\\java\\resources\\Applicationdata.properties");
	    prop.load(fis);
	    if(prop.getProperty("Browser").equalsIgnoreCase("Chrome"))
	    	 
	    	{
		    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		    	 driver=new ChromeDriver();
		   	}
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    return driver;
	    }
	}
	


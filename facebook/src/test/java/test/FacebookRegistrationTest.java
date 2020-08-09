package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookRegistrationTest {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\FahirL\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		

		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("Woorner");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selm");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("blabla321_hotmail.com");
		driver.findElement(By.xpath(".//*[@id='password_step_input']")).sendKeys("3ada23");
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();

	    
		
		Select sel1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
	    sel1.selectByValue("3");
		
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='day']")));
	    sel2.selectByValue("4");
		
	    Select sel3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
	    sel3.selectByValue("1992");
	    
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	    

	   
	    }

	
	
	

}

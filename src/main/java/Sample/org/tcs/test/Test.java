package Sample.org.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" ");
		
		driver.findElement(By.id("button")).click();
		String a=driver.getWindowHandle();
			System.out.println(a);
		
			Set<String> allid=driver.getWindowHandles();
			System.out.println((allid));
			for(String x:allid)
			{
				driver.switchTo().window(x);
			}
			driver.switchTo().frame(9);
			
			driver.findElement(By.id("button")).click();
			
			
		
	}
	

}

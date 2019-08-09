package Sample.org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jram1\\eclipse-workspace\\pgm\\org.tcs.test\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=maven+project+in+eclipse");

	}

}

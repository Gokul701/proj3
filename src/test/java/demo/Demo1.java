package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		
	}

	@Test
	public void run()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String s = driver.getTitle();
		System.out.println(s);
	}
}

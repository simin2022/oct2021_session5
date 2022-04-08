package variosconcept;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowhandle {
	WebDriver driver;

	@Before
	public void init() {System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.yahoo.com/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

	@Test
	public void windowhandlertest() throws InterruptedException  {
	//	System.out.println(driver.getTitle());
	//	String handle1= driver.getWindowHandle();
	//	System.out.println(handle1);
		driver.findElement(By.id("ybar-sbq")).sendKeys("xpath");
		driver.findElement(By.id("ybar-search")).click();
		//Thread.sleep(2000);
		//System.out.println(driver.getTitle());
	
	//	String handle2= driver.getWindowHandle();
	//	System.out.println(handle2);
		driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[1]/h3/a")).click();
		
		System.out.println(driver.getTitle());
		Set<String> handle3= driver.getWindowHandles();
		System.out.println(handle3);
		for(String i:handle3) {
			System.out.println(i);
		}
		System.out.println(driver.getTitle());
	}

}
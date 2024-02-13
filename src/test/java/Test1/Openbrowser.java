package Test1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openbrowser {
	
	@Test
	public void browserLaunch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
	}

}

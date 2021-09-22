package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    import io.github.bonigarcia.wdm.WebDriverManager;
   

public class Newtest {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("textUsername")).sendKeys("Admin");
        driver.findElement(By.id("textpassword")).sendKeys("Admin123");
        driver.findElement(By.xpath("//input@class='button']")).click();
       
	}
	



	}



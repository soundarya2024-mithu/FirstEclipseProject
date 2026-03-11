package gmailAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailTestCases {
	
	@Test
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.simplelogin.io/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("soundarya199500@gmail.com");
		driver.findElement(By.id("password")).sendKeys("MithuHanvi@2024");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
	}

}

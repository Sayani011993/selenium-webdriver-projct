package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToNaukri {

	public static void login(WebDriver driver, String naukriUrl, String username, String pwd)
			throws InterruptedException {
		driver.get(naukriUrl);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ type='text'][1]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@ type='submit']")).click();

	}

}

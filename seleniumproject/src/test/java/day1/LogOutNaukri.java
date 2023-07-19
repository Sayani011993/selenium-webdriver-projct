package day1;
// From New Branch
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutNaukri {
	public static void logOut(WebDriver driver) {
		driver.findElement(By.xpath("//img[@ alt='naukri user profile img']")).click();
		driver.findElement(By.xpath("//a[@ data-type='logoutLink']")).click();
		
	}
}

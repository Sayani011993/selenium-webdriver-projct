package day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobSearch {
	public static void searchingJob(WebDriver driver, String searchtext) throws InterruptedException {
		driver.findElement(By.xpath("//span[ text()='Search jobs here']")).click();
		driver.findElement(By.xpath("//input[@ placeholder='Enter keyword / designation / companies']"))
				.sendKeys(searchtext, Keys.ENTER);

	}
}

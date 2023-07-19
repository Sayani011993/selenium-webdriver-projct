package day1;
// From New branch
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
				.sendKeys(searchtext);
		Thread.sleep(2000);
		//String searchele="/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/ul";
		List<WebElement> lst=driver.findElements(By.xpath("//div[contains(@class,'opt ')]"));
		System.out.println("Elements found " + lst.size());
		for(WebElement wb:lst)
		{
			//System.out.println(wb.getText());
			String actText=wb.getText();
			if(actText.contains("testing"))
			{
				wb.click();
				driver.findElement(By.xpath("//span[text()='Search']")).click();				
				break;
				
			}
		}
		

	}	
}

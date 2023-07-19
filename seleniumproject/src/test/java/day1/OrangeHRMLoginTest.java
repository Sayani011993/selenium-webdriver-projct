package day1;
// From new Branch
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		String naukriUrl = "https://www.naukri.com/";
		String username = "mitrasayani71@gmail.com";
		String pwd = "Sayani@0901";
		String searchtext = "Automation";

		LoginToNaukri.login(driver, naukriUrl, username, pwd);
		Thread.sleep(2000);
		JobSearch.searchingJob(driver, searchtext);
		Thread.sleep(1000);
		//LogOutNaukri.logOut(driver);

	}

}

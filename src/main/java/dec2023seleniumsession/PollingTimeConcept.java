package dec2023seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		By twitter = By.xpath("//a[contains(@href, 'twitter11')]");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//interval time = 500 ms
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2), Duration.ofSeconds(5));//interval time = 2000 ms/2 secs

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(twitter)).click();

	}

}

package dec2023seleniumsession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		
//		selectContact("Joe Root");
//		String compName = getCompName("Joe Root");
//		System.out.println(compName);

		selectContact("Joe Root");
		
		String companyName= getCompName("Joe Root");
		System.out.println(companyName);
	
		String phoneNumber= getPhoneNumber("Joe Root");
		
		System.out.println(phoneNumber);
		
		
		By list=	(By.xpath("//select[@name='do_action']/option"));
		
		By doClick= By.xpath("//input[@value='DO']");
		
		DoSelectValueFromDropDown(list, "Subscribe to Email Campaign");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doClick(doClick);
		Thread.sleep(2000);
		
		Alert alert=	driver.switchTo().alert();
		
		alert.accept();
		
		
		
	}

	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getCompName(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static String getPhoneNumber(String contactName) {

		
		String xpath= "//a[text()='"+contactName+"']/parent::td//following-sibling::td/child::span[@context='phone']";
		
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static void getContactsInfoList(String contactName) {

	}
	
	
	
	public static void DoSelectValueFromDropDown(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);

		System.out.println(optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	
	//id/name
	//css vs xpath
		
		

	


}}
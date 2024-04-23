package dec2023seleniumsession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {
	WebDriver driver;
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// fint out total links

//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//
//		System.out.println("total links :" + allLinks.size());
//
//		for (int i = 0; i < allLinks.size(); i++) {
//			String allText = allLinks.get(i).getText();
//
//			if (allText.length() != 0)
//				System.out.println("Total Texts :" + allText);
//		}
//
//		System.out.println("---------------");
//		for (WebElement webElement : allLinks) {
//			String allTExts = webElement.getText();
//			
//			if(allTExts.length()!=0)
//			{
//			System.out.println(allTExts);
//			}
//		}
//		
//		
//		List<WebElement> allTextFields	=driver.findElements(By.className("form-control"));
		
		
	By linktext=	By.className("list-group-item");
	
	ElementUtil eleUtil =new ElementUtil(driver);
	
	System.out.println(eleUtil.getElementsTextList(linktext));

	System.out.println(eleUtil.getElementsCount(linktext));
	System.out.println (eleUtil.getElementAttributeList(linktext, "href"));
	
	
	BrowserUtil broUtil= new BrowserUtil();
	
	//broUtil.closeBrowser();
	
	
	
	
	
	
//	int totaltextFields=	allTextFields.size();
//	
//	
//	System.out.println(totaltextFields);
//		System.out.println(allTextFields.size());
//		
//				for (WebElement e : allTextFields) {
//			
//	e.sendKeys("testing");	
//			
//			//webElement.sendKeys("Vameen");
//			
//				}
			
		
}
}
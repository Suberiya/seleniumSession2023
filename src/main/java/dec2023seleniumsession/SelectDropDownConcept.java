package dec2023seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		Select select = new Select(country);

		select.selectByIndex(2);
//		select.selectByValue("Australia");
//
//		select.selectByVisibleText("India");
	}

	public static WebElement getElement(By locators) {
		return driver.findElement(locators);
	}

	public static void doSelectByIndex(By locators, int index) {

		Select select = new Select(getElement(locators));

		select.selectByIndex(index);
	}

	public void doSelectByValue(By locators, String value) {
		
		if (value == null || value.length() == 0) {
			throw new MyElementException("visible text can not be null");
		}

		Select select = new Select(getElement(locators));

		select.selectByValue(value);

	}

	public void doSelectByVisibleText(By locators, String text) {

		if (text == null || text.length() == 0) {
			throw new MyElementException("visible text can not be null");
		}

		Select select = new Select(getElement(locators));

		select.selectByVisibleText(text);
	}

}

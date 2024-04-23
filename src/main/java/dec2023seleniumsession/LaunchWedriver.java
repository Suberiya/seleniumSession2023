package dec2023seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWedriver {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("http://dev.buybooma.in/#/dashboard");
	String url= 	driver.getCurrentUrl();
		
	System.out.println(url);
	
String title=	driver.getTitle();
System.out.println(title);

if(title.equals("buyBooma"))
{
	System.out.println("Title is correct");}
	}
	{
		System.out.println("Title is in correct");
	}
		
		
		
	}



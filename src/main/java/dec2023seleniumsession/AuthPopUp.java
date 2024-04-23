package dec2023seleniumsession;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver = new ChromeDriver();
		
		//basic auth: 
		String username = "admin";
		String password = "admin";
		
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		//sel 4.x:
		//HasAuthentication
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}

}

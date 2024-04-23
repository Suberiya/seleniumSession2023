package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchBroweserHeadlessModeEdge {

	public static void main(String[] args) {
		
		WebDriver driver;

		//EdgeOptions options=new EdgeOptions();
		//options.addArguments("--headless");
		EdgeDriver d  =new EdgeDriver();
		d.get("http://dev.buybooma.in/#/login");
	d.getTitle();
		
	}

}

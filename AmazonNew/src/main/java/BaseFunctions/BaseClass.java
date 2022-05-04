package BaseFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
public WebDriver initializebrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumSampleProjects\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
}	
}
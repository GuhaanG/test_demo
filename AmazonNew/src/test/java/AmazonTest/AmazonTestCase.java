package AmazonTest;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseFunctions.BaseClass;

public class AmazonTestCase extends BaseClass{

	public WebDriver driver;
	@BeforeMethod
	public void initializesetup() {
		driver=initializebrowser();
	}
	@Test
	public void Tc001() throws InterruptedException {
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.navigate().back(); 
		//driver.navigate().forward(); 
		//driver.navigate().refresh();
		//driver.close(); 
		//driver.quit();
		/*
		 * List<WebElement> products=driver.findElements(By.
		 * xpath("//div[@class='a-section']//span[@class='a-size-medium a-color-base a-text-normal']"
		 * )); System.out.println(products.size()); for(int i=0;i<=products.size();i++)
		 * { System.out.println(products.get(i).getText()); String S1=
		 * "Apple iPhone 12 (128GB) - Blue"; String S2 = products.get(i).getText();
		 * if(products.get(i).getText()== S2){ products.get(i).click();
		 * 
		 * } }
		 */
		/*
		 * driver.navigate().to("https://www.goibibo.com/"); Thread.sleep(3000);
		 * driver.findElement(By.
		 * xpath("//span[@class='sc-gsNilK dImRia' and text()='Multi-city']")).click();
		 * driver.findElement(By.
		 * xpath("//span[@class='sc-gsNilK dImRia' and text()='Round-trip']")).click();
		 */
		//driver.navigate().to("https://www.amazon.in/Auto-Hub-Motorcycle-Washing-Cleaning/dp/B07BCB8519?ref_=Oct_d_omwf_d_5257496031&pd_rd_w=8LrTS&pf_rd_p=434d119d-9748-44f8-9f20-db43f557cf30&pf_rd_r=Z5T2JWGZ434BFCY2TYNF&pd_rd_r=9dbc88fe-30c5-4ca5-90a9-7fa982166224&pd_rd_wg=aeddC&pd_rd_i=B07BCB8519");
       // driver.findElement(By.xpath("//div[@class='gr_fswFld active']")).click();
		//List<WebElement> dates =driver.findElements(By.xpath("//div[@class='DayPicker-Day']//p"));
		//for(int i=0;i<=dates.size();i++) {
		//	String Date_Info=dates.get(i).getText();
		//	if(Date_Info.equals("31")) {
		//		dates.get(i).click();
//	driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
//	Thread.sleep(2000);
//	Select drp= new Select(driver.findElement(By.id("selectProductSort")));
//	Thread.sleep(2000);
//	drp.selectByValue("name:asc");
//	Thread.sleep(2000);
//	drp.selectByVisibleText("Reference: Lowest first");
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		Thread.sleep(2000);
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[@class='product_img_link'and @title='Faded Short Sleeve T-shirts']"))).perform();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,2000)");
		
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	
		actions.dragAndDrop(from, to).perform();
		String textTo = to.getText();
		
		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
		
		//Thread.sleep(2000);
		//actions.dragAndDropBy(from,260,60).perform();		


		}
	//	}
	}
//}


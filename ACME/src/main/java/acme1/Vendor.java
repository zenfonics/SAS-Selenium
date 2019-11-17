package acme1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Vendor {


	public static ChromeDriver driver;

	//public static void main(String[] args) throws InterruptedException {
  
	
	@Test
	public static void  search () throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//ChromeDriver driver =new ChromeDriver();

		driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://acme-test.uipath.com/account/login");


		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		Thread.sleep(4000);

		Actions builder= new Actions(driver);

		//  //button[text()[normalize-space()='Invoices']]

		WebElement inv1=   driver.findElementByXPath("//button[text()[normalize-space()='Invoices']]");
		builder.moveToElement(inv1).perform();



		driver.findElementByLinkText("Search for Invoice").click();

		driver.findElementById("vendorTaxID").sendKeys("DE763212");
		// Thread.sleep(3000);

		driver.findElementById("buttonSearch").click();


		//  List<WebElement> rows= driver.findElement(By.xpath

		// will get the number of rows

		List<WebElement> rows  = driver.findElements(By.xpath("//table[@class='table']//tr"));
		int rowSize= rows.size();

		for (int i=2;i<rowSize;i++) {

			String text= driver.findElementByXPath("//table[@class='table']//tr[" +i+"]/td[3]").getText();


			if(text.equals("IT Support")) {

				String invoiceNumber=driver.findElement(By.xpath("//table[@class='table']//tr[2]")).getText();

				System.out.println(invoiceNumber);
			}


		}

	}

	// TODO Auto-generated method stub

}



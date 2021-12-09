package WebAutomation.Daraz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import WebAutomation.Daraz.*;

public class OrderItem extends Driversetup{

	public static String baseUrl="https://www.daraz.com.bd/";
	
	@Test
	public static void Daraz() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Assertion
		String actualTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";		
		String gettitel=driver.getTitle();
		
		Assert.assertEquals(actualTitle,gettitel);
		
		driver.findElement(By.xpath(Xpaths.firstCatagory)).click();
		Thread.sleep(1000);
		
		
		//Hover
		WebElement hover = driver.findElement(By.xpath(Xpaths.secondCatagory));
		
		Actions action = new Actions(driver);
		action.clickAndHold(hover).build().perform();
		
		driver.findElement(By.xpath(Xpaths.thirdCatagory)).click();
		driver.findElement(By.xpath(Xpaths.firstproduct)).click();
		driver.findElement(By.xpath(Xpaths.addToCart)).click();
		
		//Iframe
		WebElement loginFrame = driver.findElement(By.xpath(Xpaths.loginModal));
		driver.switchTo().frame(loginFrame);
		
		
		driver.findElement(By.xpath (Xpaths.userEmail)).sendKeys("01558016661");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath (Xpaths.userPass)).sendKeys("moshakill123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath (Xpaths.modalLoginButton)).click();
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath (Xpaths.checkout)).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath (Xpaths.deliveryFullName)).sendKeys("Mohiuzzaman");
		Thread.sleep(1000);
		driver.findElement(By.xpath (Xpaths.deliveryPhoneNumber)).sendKeys("01558016661");
		Thread.sleep(1000);
		driver.findElement(By.xpath (Xpaths.deliveryEmail)).sendKeys("mzbornav1@gmail.com");
		Thread.sleep(1000);
		
		
		//DropDown		
		driver.findElement(By.xpath (Xpaths.deliveryRegion)).click();
		driver.findElement(By.xpath (Xpaths.deliveryRegion_Dhaka)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath (Xpaths.deliveryCity)).click();
		driver.findElement(By.xpath (Xpaths.deliveryCity_DhakaSouth)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath (Xpaths.deliveryArea)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath (Xpaths.deliveryArea_Dhanmondi_10A)).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath (Xpaths.deliveryAddress)).sendKeys("28/B zigatola");
		driver.findElement(By.xpath (Xpaths.deliveryTo_Home)).click();
		driver.findElement(By.xpath (Xpaths.deliverySaveButton)).click();
		Thread.sleep(10000);
		
	}
	
}

package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SwagLabsTest {
  @Test
  public void f() throws Throwable {

	    System.setProperty("webdriver.chrome.driver", "./DriverFolder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("user-name"));
		username.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.name("login-button"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement sort = driver.findElement(By.xpath("//select[@data-test=\"product_sort_container\"]"));		
		Select namesort1 = new Select(sort);
		namesort1.selectByValue("az");
		
		Thread.sleep(2000);
		
		WebElement bag = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		bag.click();
		
		Thread.sleep(2000);
		
//		Select namesort2 = new Select(sort);
//		namesort2.selectByValue("za");
		
		Select pricesort1 = new Select(sort);
		pricesort1.selectByValue("lohi");
		
		Thread.sleep(2000);
		
		WebElement jacket = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
		jacket.click();		
		
		Thread.sleep(2000);
		
//		WebElement shop = driver.findElement(By.name("continue-shopping"));
//		shop.click();
				
		WebElement tshirt = driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)"));
		tshirt.click();
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
		cart.click();
		
		Thread.sleep(2000);
		
		WebElement remove = driver.findElement(By.name("remove-sauce-labs-fleece-jacket"));
		remove.click();
		
		Thread.sleep(2000);
		
		WebElement order = driver.findElement(By.name("checkout"));
		order.click();
		
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys("Bhoomika");
		
		WebElement lname = driver.findElement(By.name("lastName"));
		lname.sendKeys("U");
		
		WebElement pincode = driver.findElement(By.name("postalCode"));
		pincode.sendKeys("575003");
		
		Thread.sleep(2000);
		
		WebElement next = driver.findElement(By.name("continue"));
		next.click();
		
		WebElement finish = driver.findElement(By.name("finish"));
		finish.click();
		
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.name("back-to-products"));
		home.click();
		
		Thread.sleep(2000);
		
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.linkText("LOGOUT"));
		logout.click();
			  
  }
}

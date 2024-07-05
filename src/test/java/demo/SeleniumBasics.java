package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumBasics {

	@Test(groups = { "regression", "sanity" })
	public void testBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://snapdeal.com/");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		driver.findElement(By.id("pushDenied")).click();

		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.navigate().refresh();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).build().perform();
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='login']"));
		js.executeScript("arguments[0].click()", ele1);

		Thread.sleep(3000);
		
		
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("jbdbjasbdjbaj@gmail.com");
		driver.findElement(By.id("checkUser")).click();
		Thread.sleep(3000);
		driver.quit();

	}
}

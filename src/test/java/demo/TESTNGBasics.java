package demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TESTNGBasics {
	
	WebDriver driver;
	// Annotations
	
	// @Test
	// @BeforeMethod   - Login
	// @AfterMethod    - Logout/Close browser window
	// @BeforeSuite
	// @BeforeTest
	// @BeforeClass
	// @AfterSuite
	// @AfterClass
	// @AfterTest
	
	
	// BM
	// testcase1
	//AM
	//BM
	//testcase2
	//AM
	
	
	// Execution order of annotations
	// @BeforeSuite- DB connection and creating folders for reports
	// @BeforeTest
	// @BeforeClass -  uploading users into users
	// @BeforeMethod  - Login
	// @Test
	// @Test
	// @Test
	// @AfterMethod  - Logout and quitting browser
	// @AfterClass   - remove the excel or json file
	// @AfterTest
	// @AfterSuite- closing connection to DB
	
	
	// Scroll up, down & JS click
	
	
	
	
	
	// TestNG execution Order & assertions
	// testNG.xml file
	// priority in testNG
	// grouping
	// how to run dependent test
	
	
	
	@BeforeMethod
	public void login()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test()
	public void testCase1() throws InterruptedException
	{
		//register candidate
		//logging to app with the new user
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0, 500)", "");  //  scroll down
		js.executeScript("window.ScrollBy(0, -500)", ""); // scroll up
		
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("")));
		
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("")));
		
		// Assert class
		// Hard assertions
		Assert.assertEquals("TESTING", "TESTING123","args are not matching");
		
		Assert.assertTrue(driver.findElement(By.id("id")).isDisplayed());  // pass
		
		Assert.assertFalse(driver.findElement(By.id("")).isDisplayed(),"element is not visible");
		
		// Soft Assert- executiomn will be moved to next step
		
		/*
		 * SoftAssert assert = new SoftAssert(); assert.assertEquals("TESTING",
		 * "TESTING123");
		 */
		// Hard Assert  - script will be stopped
			
	}
	
	@Test()
	public void testCase2()
	{
		//searching for product
		// adding to the cart
	}
	
	@Test
	public void testCase3()
	{
	
	}
	
	@AfterMethod
	public void logout()
	{
		//logout
	}

}

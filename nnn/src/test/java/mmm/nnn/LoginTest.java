package mmm.nnn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mmm.nnn.LoginPom;

public class LoginTest {

	WebDriver driver = null;

	String testUrl = "https://login.salesforce.com/";

	@BeforeMethod

	//Browser open

	public void setUp(){

	//Download the ChromeDriver. To download click here

	//Set the system property to open the chrome browser.

	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse projects\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();

	driver.get(testUrl);

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test

	public void validLoginPOM() throws InterruptedException {

	LoginPom loginpage= new LoginPom(driver);

	loginpage.LoginWithoutCookies("ssaisrinivas227@gmail.com", "S$s9704312287");

	Thread.sleep(25000); // wait 25 second, meanwhile you will get email verification code.

	//Enter verification code manually which you received on email

	WebElement verifyButton = driver.findElement(By.id("save"));

	verifyButton.click();

	}

	@Test

	public void validLoginPOM1() throws InterruptedException {

	LoginPom loginpage= new LoginPom(driver);

	loginpage.LoginwithCookies("ssaisrinivas227@gmail.com", "S$s9704312287");

	Thread.sleep(25000);

	//Enter verification code manually.

	WebElement verifyButton = driver.findElement(By.id("save"));

	verifyButton.click();

	driver.quit();// close your browser

	}

	@AfterMethod

	public void TestClose() throws Exception {

	driver.quit();

	}
	
	
}

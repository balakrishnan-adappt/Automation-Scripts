package seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class selenium_session {
	
	public static WebDriver driver;
	public static String browser_name="chrome";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		/*launching browsers*/
		switch(browser_name) { 
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome browser has launched");
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bala\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox browser has launched");
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Bala\\Downloads\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			System.out.println("IE browser has launched");
			break;
		}
		
		driver.get("http://automationpractice.com/index.php"); //enter URL
		
		driver.findElement(By.linkText("Sign in")).click(); //clicking on sign in button
		
		driver.findElement(By.id("email")).sendKeys("bala@yopmail.com"); //entering username
		System.out.println("username is enetered");
		
		driver.findElement(By.id("passwd")).sendKeys("123456"); //entering password
		System.out.println("password is enetered");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//i[@class='icon-lock left']")).click(); //clicking on signin button
		
		Thread.sleep(3000);
		
		/*implicit wait*/
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*explicit wait*/
//		 WebDriverWait wait = new WebDriverWait(driver, 10);
//		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(>someid>)));
		
		driver.close();

	}

}

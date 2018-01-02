package seleniumsession;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome browser is launched");
		
		driver.get("http://www.gmail.com");
		
		try {
		driver.findElement(By.name("identifier")).sendKeys("adghakgsdkh");
		driver.findElement(By.xpath(".//span[@class='RveJvd snByac']")).click();
		
		driver.findElement(By.name("password")).sendKeys("adsad");
		
	} catch (Exception e) {
		
		System.out.println("USername is not correct");
//		geterror();
     	getscreenshot();
		
	}
		
	}
	
	public static void getscreenshot() throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:\\Screenshot.jpg"));
	}
	
	public static void geterror() {
		String error = driver.findElement(By.xpath(".//div[@jsname='B34EJ']")).getText();
		System.out.println(" "+ error);
	}
}


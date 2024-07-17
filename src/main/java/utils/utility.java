package utils;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class utility {
	
	public static WebDriver driver;
	
	public void launchbrowser() {
		driver= new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
				
	}
	
	public void closebrowser() {
		driver.close();		
	}
	
	public void click(WebElement e) {
		e.click();		
	}
	
	public void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
		
	public void screenshot(String Name) throws IOException {
		File src = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\Lishanth\\eclipse-workspace\\phptraveldemo\\screenshotphp" +Name+ ".png");
		FileUtils.copyFile(src, des);
	}

}

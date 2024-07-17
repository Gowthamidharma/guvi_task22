package pages;



import java.io.IOException;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.pjtspcmethod;

public class homepage extends pjtspcmethod {
	
	
	public homepage(WebDriver driver) {
		homepage.driver=driver;
		
	}
	
	public homepage fristname(String FN) {
		sendkeys(driver.findElement(By.name("first_name")),FN);
		return this;				
	}
	
	public homepage lastname(String LN) {
		sendkeys(driver.findElement(By.name("last_name")),LN);
		return this;
		
	}
	
	public homepage countrycode() {
		WebElement ele = driver.findElement(By.id("country_id"));
		Select code = new Select(ele);
		code.selectByValue("99");
		return this;
			
	}
	public homepage number(String no) {
		sendkeys(driver.findElement(By.name("whatsapp")), no);
		return this;
		
	}
	
	public homepage businessname(String Businessname) {
		sendkeys(driver.findElement(By.name("business_name")), Businessname);
		return this;
	}
	
	public homepage email(String email) {
		sendkeys(driver.findElement(By.name("email")),email);
		return this;		
	}
	
	
	
	//get the value in string format
	
	public String firtnum() {
		String firstnum= driver.findElement(By.xpath("//span[@id='numb1']")).getText();	
		return firstnum;		
		
	}
	
	public String secondnum() {
			
		String secondnum = driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		return secondnum;		
		
	}
	// parse the string as int
	public int getfirstnum() {
		return Integer.parseInt(firtnum());
		
	}
	
	public int getsecondnum() {
		return Integer.parseInt(secondnum());
		
	}
	// sum logic
	public int add() {
		int add = getfirstnum() + getsecondnum();		
		return add;
		
	}
	// convert the int to string to pass to sendkeys method
	public String getasstring() {
		String addition = Integer.toString(add());
		return addition;	
		
	}	
	
	public homepage result(String getstring) {
		sendkeys(driver.findElement(By.id("number")),getasstring());
		return this;		
	}
	
	public homepage submit() {
		// use webdriver wait 
		
		click(driver.findElement(By.xpath("//small[text()='Submit']")));
		return this;
	}
	
	public homepage screenshot() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='completed']")));		
		String verify = driver.findElement(By.xpath("//div[@class='completed']")).getText();
		System.out.println(verify);
	 	 
		screenshot("Output");
		return this;	 
		
		
	}	
	
	
}

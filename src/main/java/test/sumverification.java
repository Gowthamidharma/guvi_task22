package test;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.pjtspcmethod;
import pages.homepage;

public class sumverification extends pjtspcmethod {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		homepage obj= new homepage(driver);
				
		obj.launchbrowser();
		obj.fristname("G");
		obj.lastname("D");
		obj.businessname("GD");
		obj.countrycode();		
		obj.number("9600192572");
		Actions mousedown = new Actions(driver);
		WebElement e =driver.findElement(By.xpath("//button[@id='demo']"));
		mousedown.moveToElement(e).perform();		
		obj.email("gowthamidharma@gmail.com");
		obj.firtnum();
		obj.secondnum();
		obj.getfirstnum();
		obj.getsecondnum();
		obj.add();
		obj.getasstring();
		obj.result("result");	
		obj.submit();
		obj.screenshot();
		//obj.closebrowser();

	}

}

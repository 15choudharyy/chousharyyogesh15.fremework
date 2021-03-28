package com.comcast.contactlist;

import java.util.List;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.desksolution.gernericrepositary.Baseclass;
import com.crm.desksolution.gernericrepositary.WebdriverUtility;

	public class RandomClass extends Baseclass{
		@Test
		public void RandomClassTest() throws InterruptedException
		
	 {
			
			WebdriverUtility wd= new WebdriverUtility();
			
		wd.waitForElement(driver);
			
	    Random ref= new Random();
	    int ran= ref.nextInt(1000);
	
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		driver.findElement(By.name("accountname")).sendKeys("ymca"+ran);
	      WebElement wb =driver.findElement(By.name("industry"));

	      
	      wd.selectDropDown("Education", wb);
	      
	      
	     /* Select s= new Select(wb);

	s.selectByVisibleText("Education");*/

	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
	
	
	Thread.sleep(3000);

	   
	}
	}



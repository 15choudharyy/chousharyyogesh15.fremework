    package com.comcast.contactlist;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.desksolution.gernericrepositary.Baseclass;



	public class DeleteContactTest extends Baseclass {
		
		    @Test
			public void DeleteContact1() throws InterruptedException
		 {
				
			
					
					driver.findElement(By.xpath("//a[text()='Contacts']")).click();
					
					driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
					driver.findElement(By.name("lastname")).sendKeys("choudhary");
					
					driver.findElement(By.xpath("//img[@alt='Select']")).click();
					
					Thread.sleep(2000);
					 //GET MAIN ID AND CHILD ID
			   		String mainid= driver.getWindowHandle();
			   		Set<String> allid= driver.getWindowHandles();
			   		
			   		//SWITCH TO THE CHILD
			   		  for(String id : allid)
			   		{
			   			if(!mainid.equals(id))
			   		   {
			   				driver.switchTo().window(id);
			   		   }
			   		 }
			   		  
			   		  
			   		  Thread.sleep(2000);
			   		  
			   		 driver.findElement(By.xpath("//a[contains(@onclick,'ymca')]")).click();
			   		 
			   		 driver.switchTo().window(mainid);
			   		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			   		
			   		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			   		
			   		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input[@name='selected_id']")).click();
			   		
			   		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
			   		
			   		Alert alt= driver.switchTo().alert();
			   		alt.accept();
			   		
			   		Thread.sleep(2000);
			   		WebElement wb=driver.findElement(By.xpath("//span[text()=' Administrator']/../following-sibling::td"));
			   		
			   		Actions act= new Actions(driver);
			   		
			   		act.moveToElement(wb).perform();
			   		
			   		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
			   		
			   		
			   	
			   		
			   	
			}

	}




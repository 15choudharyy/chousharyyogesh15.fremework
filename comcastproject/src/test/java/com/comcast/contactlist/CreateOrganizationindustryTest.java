package com.comcast.contactlist;

     import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.desksolution.gernericrepositary.Baseclass;







	public class CreateOrganizationindustryTest extends Baseclass {
		
		
		@Test
		public void CreateOrganization() throws InterruptedException 
		
	 {
			
        WebDriver driver = new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("http://localhost:8888/index.php?action=Login&module=Users");
			
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("root");
			
			driver.findElement(By.id("submitButton")).click();
			
			
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			
			
			driver.findElement(By.name("accountname")).sendKeys("ymca");
		WebElement wb =driver.findElement(By.name("industry"));
		
		Select s= new Select(wb);
		
		s.selectByVisibleText("Education");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
	Thread.sleep(2000);
		
		List<WebElement> all= driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a[@title='Organizations']"));
		
		String Expected="ymca";
		int count=0;
		for(WebElement wb1 :all)
		{
			
			String actual=wb1.getText();
			
			if(Expected.equals(actual));
			{
				count++;
				System.out.println("pass");	
				
				break;
				}
			
			}
		     if(count==0)
		     {
		    	System.out.println("fail"); 
		     }
		
		     Thread.sleep(2000);
		   		WebElement wb1=driver.findElement(By.xpath("//span[text()=' Administrator']/../following-sibling::td"));
		   		
		   		Actions act= new Actions(driver);
		   		
		   		act.moveToElement(wb1).perform();
		   		
		   		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
		   		
		   		driver.close();
		

		
	}
	}
	




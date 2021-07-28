package FinalProj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryTours {

	
     public static void main(String[] args) 
					{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdrive2\\ChromeWebdrive\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		/*
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//get actual value of title
		actualTitle = driver.getTitle();
		
		
		//compare actual and accepted title
		
		
		if (actualTitle.contentEquals(actualTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
			
		}
		
		//to display URL
		driver.getCurrentUrl();
		System.out.println("Current URL IS:" + driver.getCurrentUrl());

						
		
		//Registration
						
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]")).click();
						
		driver.findElement(By.name("firstName")).sendKeys("Amruta");
		driver.findElement(By.name("lastName")).sendKeys("Khutwad");
		driver.findElement(By.name("phone")).sendKeys("9527032303");
		driver.findElement(By.name("userName")).sendKeys("khutwadamruta2@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Katraj,Pune");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("412213");
				Select drplist=new Select (driver.findElement(By.name("country")));
		drplist.selectByIndex(107);
		
		driver.findElement(By.id("email")).sendKeys("khutwadamruta2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amruta15");
		driver.findElement(By.name("confirmPassword")).sendKeys("Amruta15");
		driver.findElement(By.name("submit")).click();
		
					
		//signIn
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a")).click();
						
		driver.findElement(By.name("userName")).sendKeys("khutwadamruta2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Amruta15");
		driver.findElement(By.name("submit")).click();
		
		//Window scroll
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		
		
				
					
                  //For Flights
						
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		 WebElement radio1 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));   //Type
						 radio1.click();
		 System.out.println("Radio button option 1 is selected");
					       
					      //Passengers
					       
		 Select drplist1=new Select (driver.findElement(By.name("passCount")));
				 drplist1.selectByIndex(1);
					
				 //Departing From
		 Select drplist11=new Select (driver.findElement(By.name("fromPort")));
				drplist11.selectByIndex(5);
				
				//On Date			
				   
		 Select drplist111=new Select (driver.findElement(By.name("fromMonth")));
				drplist111.selectByIndex(7);
					
									   
		 Select drplist1111=new Select (driver.findElement(By.name("fromDay")));
				drplist1111.selectByIndex(20);
								
					//Arriving In
		 Select drplist2=new Select (driver.findElement(By.name("toPort")));
				drplist2.selectByIndex(4);
					//Returning				
		 Select drplist3=new Select (driver.findElement(By.name("toMonth")));
				drplist3.selectByIndex(8);
											
		 Select drplist4=new Select (driver.findElement(By.name("toDay")));
			   drplist4.selectByIndex(2);
					
			   //Service Class
		 driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[1]/font/b")).click();
			  WebElement radio2 = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"));   //Type
					     radio2.click();
			 System.out.println("Radio button option business is selected");
					 
				//Airline	 
		 Select drplist5=new Select (driver.findElement(By.name("airline")));
				 drplist5.selectByIndex(1);
				     
		 driver.findElement(By.name("findFlights")).click();
		 
		
		 	


		  
			
			
		
		
			
			//sign off
			  driver.findElement(By.linkText("SIGN-OFF")).click();

             driver.findElement(By.linkText("SUPPORT")).click();
             driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/a[1]/img[1]")).click();

		     driver.findElement(By.linkText("CONTACT")).click();
             driver.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]"));
             
             */
             
		
		
		//Insurance Module
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[3]/a")).click();
		
		driver.findElement(By.id("email")).sendKeys("khutwadamruta2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Amruta15");
		driver.findElement(By.xpath("/html/body/div[3]/form/div[3]/input")).click();
		
		
		
		
			   driver.findElement(By.linkText("Edit Profile")).click();

				driver.findElement(By.id("user_occupation_id")).click();
				Select title = new Select(driver.findElement(By.id("user_occupation_id")));
				title.selectByIndex(6);
				driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/form/div[14]/input")).click();
				//Back to previous 	     
				 driver.navigate().back();
				 

			

		
             	//to close browser
			//driver.close();
			
			

					 
					 
	}


			


	}



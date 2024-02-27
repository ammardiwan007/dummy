package Scenarios_for_Certifications;

import java.io.Console;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class direct_submit_error{

		 
	
//                                  ||--- Input_Form_Submit ---||

		@Test
		public void Input_Form_Submit() {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				
			
		    	driver.get("https://www.lambdatest.com/selenium-playground/");		
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[20]/a")).click();
				String title = driver.getTitle();
				System.out.println();
				


			    //  Direct Submit
				driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();

				//				if ( driver.getPageSource().contains("Please fill in the fields"));
//				{
//				        String expectedText = "Please fill in the fields";
//				        System.out.println("expectedText");
//
//				}
//				
//				String msg1 = "Thanks for contacting us, we will get back to you shortly.";
//		        String actual_text1=msg1.getText();
//		        String expectedText1 = "Thanks for contacting us, we will get back to you shortly.";
//		        Assert.assertEquals(actual_text1,expectedText1);
//		        System.out.println(expectedText1);
//		        System.out.println(actual_text1);
//			
//				
				
//				
//				driver.getPageSource().contains("Please fill in the fields");
//				try
//				{
//				  Assert.IsTrue(verifyTextPresent("Selenium Wiki"));
//				  Console.WriteLine("Selenium Wiki test is present on the home page");
//				}
//				catch (Exception)
//				{
//				  Console.WriteLine("Selenium Wiki test is not present on the home page");
//				}
				
				
				
				
			    // Name
			        driver.findElement(By.id("name")).sendKeys("Ammar Diwan");	


			    // Submit
				driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
				
				WebElement msg=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/p"));
		        String actual_text=msg.getText();
		        String expectedText = "Thanks for contacting us, we will get back to you shortly.";
		        Assert.assertEquals(actual_text,expectedText);
		        System.out.println(expectedText);
		        System.out.println(actual_text);
			
			
		}

		}

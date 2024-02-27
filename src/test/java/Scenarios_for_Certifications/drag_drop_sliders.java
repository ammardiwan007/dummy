package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop_sliders {
	
		 
		
//	                                  ||--- Drag & Drop Sliders ---||

			@Test
			public void drag_drop_sliders_Submit() {
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
					
			    	driver.get("https://www.lambdatest.com/selenium-playground/");		
					driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/ul/li[13]/a")).click();
					driver.getTitle();
					System.out.println();      
							
						    // Default value 5
							   WebElement  value_5  = driver.findElement(By.xpath("//input[@value='5']"));
					                     Actions action5 = new Actions(driver);
					                     action5.dragAndDropBy(value_5,12, 12).perform();
						    // Default value 20
							   WebElement  value_20  = driver.findElement(By.xpath("//input[@value='20']"));
					                     Actions action20 = new Actions(driver);
					                     action20.dragAndDropBy(value_20,10, 13).perform();

						    // Default value 15
							   WebElement  value_15  = driver.findElement(By.xpath("//input[@value='15']"));
					                     Actions action15 = new Actions(driver);
					                     action15.dragAndDropBy(value_15,12, 12).perform();
						    // Default value 50
							   WebElement  value_50  = driver.findElement(By.xpath("//input[@value='50']"));
					                     Actions action50 = new Actions(driver);
					                     action50.dragAndDropBy(value_50,25, 13).perform();

						    // Default value 25
							   WebElement  value_25  = driver.findElement(By.xpath("//input[@value='25']"));
					                     Actions action25 = new Actions(driver);
					                     action25.dragAndDropBy(value_25,9, 18).perform();
						    // Default value 30
							   WebElement  value_30  = driver.findElement(By.xpath("//input[@value='30']"));
					                     Actions action30 = new Actions(driver);
					                     action30.dragAndDropBy(value_30,6,19).perform();

						    // Default value 40
							   WebElement  value_40  = driver.findElement(By.xpath("//input[@value='40']"));
					                     Actions action40 = new Actions(driver);
					                     action5.dragAndDropBy(value_40,1,6).perform();
						    // Default value 80
							   WebElement  value_80  = driver.findElement(By.xpath("//input[@value='80']"));
					                     Actions action80 = new Actions(driver);
					                     action80.dragAndDropBy(value_80,4,22).perform();	          
			          
       }
}
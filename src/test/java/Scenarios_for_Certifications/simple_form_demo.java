package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simple_form_demo {
	
		 
		
//	                                  ||--- Simple Form Demo ---||

			@Test
			public void simple_form_demo_Submit() {
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win64/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
					
			    	driver.get("https://www.lambdatest.com/selenium-playground/");		
					driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/ul/li[34]/a")).click();
					String title = driver.getTitle();
					System.out.println();
			
		// Single Input Field
			          driver.findElement(By.id("user-message")).sendKeys("Welcome to Lamba Test Certification");
			          driver.findElement(By.id("user-message")).getAttribute("placeholder");
			          String attribute_Enter_Message = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
			          System.out.println("placeholder value: "+attribute_Enter_Message );	
			
			  // Result:
			          driver.findElement(By.xpath("//*[@id=\"showInput\"]")).click();
			          String text = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
			          System.out.println("Result: "+text);
			
			
		  // Two Input Fields			
			     // Enter first value
			          driver.findElement(By.id("sum1")).sendKeys("25");
			          driver.findElement(By.id("user-message")).getAttribute("placeholder");
			          String attribute_Please_enter_first_value = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
			          System.out.println("placeholder value: "+attribute_Please_enter_first_value );		
			     //Enter second value
			          driver.findElement(By.id("sum2")).sendKeys("25");
			          driver.findElement(By.id("user-message")).getAttribute("placeholder");
			          String attribute_Please_enter_second_value = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
			          System.out.println("placeholder value: "+attribute_Please_enter_second_value );			
			     // Sum
			          driver.findElement(By.xpath("//button[text()='Get Sum']")).click();	
			    // Result:
			          driver.findElement(By.xpath("//*[@id=\"addmessage\"]")).getText();
			          System.out.println("Result: "+text);
			
			}
}


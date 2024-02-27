package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class input_form_1{

		 
	
//                                  ||--- Input_Form_Submit ---||

		@Test
		public void Input_Form_Submit() {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			    driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
				
//		    	driver.get("https://www.lambdatest.com/selenium-playground/");		
//				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[20]/a")).click();
//				String title = driver.getTitle();
//				System.out.println();
//				
			    
			    // Name
//				driver.findElement(By.id("name")).sendKeys("Ammar Diwan");
//				driver.findElement(By.id("name")).getAttribute("placeholder");
//				String attribute_Name = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
//				System.out.println("placeholder value: "+attribute_Name );	
				
			    // Email
				 //driver.findElement(By.id("inputEmail4")).sendKeys("ammarshadiwan@yopmail.com");

				
				//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ammarshadiwan@yopmail.com");
				//*[@id="inputEmail4"]
				
//				driver.findElement(By.id("inputEmail4")).getAttribute("placeholder");
//				String attribute_Email = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
//				System.out.println("placeholder value: "+attribute_Email);	
//				
			    // Password
//				driver.findElement(By.id("inputPassword4")).sendKeys("Ammar@123");
//				driver.findElement(By.id("inputPassword4")).getAttribute("placeholder");
//				String attribute_Passowrd = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
//				System.out.println("placeholder value: "+attribute_Passowrd);		
//				
			    // Company
//				driver.findElement(By.id("company")).sendKeys("LambdaTest");
//				driver.findElement(By.id("company")).getAttribute("placeholder");
//				String attribute_company = driver.findElement(By.id("company")).getAttribute("placeholder");;
//				System.out.println("placeholder value: "+attribute_company);	
//				
//			    // website:
//				driver.findElement(By.id("websitename")).sendKeys("https://www.lambdatest.com/");
//				driver.findElement(By.id("websitename")).getAttribute("placeholder");
//				String attribute_Website = driver.findElement(By.id("websitename")).getAttribute("placeholder");;
//				System.out.println("placeholder value: "+attribute_Website);
//				
//			    // Country
//				driver.findElement(By.name("country"));
//				WebElement Country_Dropdown = driver.findElement(By.name("country"));
//				Select countries = new Select(Country_Dropdown);
//				countries.selectByValue("IN");
//				WebElement firstSelectedOption =  countries.getFirstSelectedOption(); 
//				System.out.println("select dropdown value: " +firstSelectedOption);
//				
//				
//			    // City
     		driver.findElement(By.id("inputCity")).sendKeys("Ahmedabad");
			driver.findElement(By.id("inputCity")).getAttribute("placeholder");
			String attribute_inputCity = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_inputCity);	
				
			    // Address1
				driver.findElement(By.id("inputAddress1")).sendKeys("Sharkhej");
				driver.findElement(By.id("inputAddress1")).getAttribute("placeholder");
				String attribute_inputAddress1 = driver.findElement(By.id("inputAddress1")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_inputAddress1);

			    // Address2
				driver.findElement(By.id("inputAddress2")).sendKeys("Ahmedabad");
				driver.findElement(By.id("inputAddress2")).getAttribute("placeholder");
				String attribute_inputAddress2 = driver.findElement(By.id("inputAddress2")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_inputAddress2);

			    // inputState
				driver.findElement(By.id("inputState")).sendKeys("Gujarat");
				driver.findElement(By.id("inputState")).getAttribute("placeholder");
				String attribute_inputState = driver.findElement(By.id("inputState")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_inputState);	

			    // inputZip
				driver.findElement(By.id("inputZip")).sendKeys("383001");
				driver.findElement(By.id("inputZip")).getAttribute("placeholder");
				String attribute_inputZip = driver.findElement(By.id("inputZip")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_inputZip);	

			    // Submit
				driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
				

			
		}

		}

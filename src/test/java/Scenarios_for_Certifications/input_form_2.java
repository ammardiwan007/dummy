package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class input_form_2{

		 
	
//                                  ||--- Input_Form_Submit ---||

		@Test
		public void Input_Form_Submit() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				
			
		    	driver.get("https://www.lambdatest.com/selenium-playground/");	
		    	driver.manage().window().maximize();
		    	
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[20]/a")).click();
				
		      // Validation popup -> without filling any data direct clicking on "Submit" button
				driver.findElement(By.xpath("//*[text()='Submit']")).click();
				Thread.sleep(3000);
     			String title = driver.getTitle();
				System.out.println();				

			    // Name
			        driver.findElement(By.id("name")).sendKeys("Ammar Diwan");	
				
			    // Email
			        driver.findElement(By.id("inputEmail4")).sendKeys("ammarshadiwan@yopmail.com");				
				//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ammarshadiwan@yopmail.com");
				//*[@id="inputEmail4"]
					
			    // Password
			        driver.findElement(By.id("inputPassword4")).sendKeys("Ammar@123");
		
				
			    // Company
			        driver.findElement(By.id("company")).sendKeys("LambdaTest");
	
			    // website:
			        driver.findElement(By.id("websitename")).sendKeys("https://www.lambdatest.com/");
				
			    // Country
			        driver.findElement(By.name("country"));
			        WebElement Country_Dropdown = driver.findElement(By.name("country"));
			        Select countries = new Select(Country_Dropdown);
			        countries.selectByValue("US");
			        WebElement firstSelectedOption =  countries.getFirstSelectedOption(); 
			        System.out.println("select dropdown value: " +firstSelectedOption);
					Thread.sleep(100);
		
			    // City
			        driver.findElement(By.id("inputCity")).sendKeys("Ahmedabad");
				
			    // Address1
				driver.findElement(By.id("inputAddress1")).sendKeys("Sharkhej");

			    // Address2
				driver.findElement(By.id("inputAddress2")).sendKeys("Ahmedabad");

			    // inputState
				driver.findElement(By.id("inputState")).sendKeys("Gujarat");

			    // inputZip
				driver.findElement(By.id("inputZip")).sendKeys("383001");

			    // Submit
				driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button")).click();
				
				Thread.sleep(2000);
			    
				// Form Demo Page
		          //Heading
					WebElement Heading=driver.findElement(By.xpath("//h2[text()='Input form validations']"));
			        String actual_text=Heading.getText();
			        String expectedText = "Input form validations";
			        Assert.assertEquals(actual_text,expectedText);
			        System.out.println(expectedText);
			        System.out.println(actual_text);
			      // Success Messages
					WebElement Success_Messages=driver.findElement(By.xpath("//*[@class=\"success-msg hidden\"]"));
			        String actual_text_Success_Messages= Success_Messages.getText();
			        String expectedText_Success_Messages = "Thanks for contacting us, we will get back to you shortly.";
			        Assert.assertEquals(actual_text_Success_Messages,expectedText_Success_Messages);
			        System.out.println(expectedText_Success_Messages);
			        System.out.println(actual_text_Success_Messages);
				
     		}

		}

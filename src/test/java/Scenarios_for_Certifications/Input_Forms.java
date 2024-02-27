package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Input_Forms{
	public String username = "ammarshadiwan";
	public String accesskey = "GshMiJioSmiFQGCUk0QDJxsqFyw7p4DWiZlA5dwy4k46wyqqSj";
	public static RemoteWebDriver driver = null;
	public String gridURL = "@hub.lambdatest.com/wd/hub"; //hub endpoint
	boolean status = false;
	
	@BeforeClass
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("version", "70.0");
//		capabilities.setCapability("browserName", "MicrosoftEdge");
//		capabilities.setCapability("browserVersion", "120.0");
//		capabilities.setCapability("browserName", "Firefox");
//		capabilities.setCapability("browserVersion", "122.0");
		capabilities.setCapability("platform", "win11"); // If this cap isn't specified, it will just get the any available one
		capabilities.setCapability("build", "build 3");
		capabilities.setCapability("name", "certification build");
		capabilities.setCapability("network", "true");
		capabilities.setCapability("visual", "true");
		capabilities.setCapability("video", "true");
		capabilities.setCapability("console", "true");
		capabilities.setCapability("build", "DropDown");
		
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	 
	
//                                  ||--- Input_Form_Submit ---||

		@Test
		public void Input_Form_Submit() throws Exception {
			try {
				driver.get("https://www.lambdatest.com/selenium-playground/");
				
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[20]/a")).click();
				String title = driver.getTitle();
				System.out.println();
				
			    // Name
				driver.findElement(By.id("name")).sendKeys("Ammar Diwan");
				driver.findElement(By.id("name")).getAttribute("placeholder");
				String attribute_Name = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_Name );	
				
			    // Email
				driver.findElement(By.id("inputEmail4")).sendKeys("ammarshadiwan@yopmail.com");
				driver.findElement(By.id("inputEmail4")).getAttribute("placeholder");
				String attribute_Email = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_Email);	
				
			    // Password
				driver.findElement(By.id("inputPassword4")).sendKeys("Ammar@123");
				driver.findElement(By.id("inputPassword4")).getAttribute("placeholder");
				String attribute_Passowrd = driver.findElement(By.id("user-message")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_Passowrd);		
				
			    // Company
				driver.findElement(By.id("company")).sendKeys("LambdaTest");
				driver.findElement(By.id("company")).getAttribute("placeholder");
				String attribute_company = driver.findElement(By.id("company")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_company);	
				
			    // website:
				driver.findElement(By.id("websitename")).sendKeys("https://www.lambdatest.com/");
				driver.findElement(By.id("websitename")).getAttribute("placeholder");
				String attribute_Website = driver.findElement(By.id("websitename")).getAttribute("placeholder");;
				System.out.println("placeholder value: "+attribute_Website);
				
			    // Country
				driver.findElement(By.name("country"));
				WebElement Country_Dropdown = driver.findElement(By.name("country"));
				Select countries = new Select(Country_Dropdown);
				countries.selectByValue("IN");
				WebElement firstSelectedOption =  countries.getFirstSelectedOption(); 
				System.out.println("select dropdown value: " +firstSelectedOption);
				
				
			    // City
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
				
				 {
						status = true;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		}
		
//--	
	
	@AfterClass
	public void tearDown() throws Exception {
		if (driver != null) {
			((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
			driver.quit();
		}
	}
}
package Scenarios_for_Certifications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
public class Test_Scenarios{
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
		capabilities.setCapability("build", "build_1");
		capabilities.setCapability("name", "certification build");
		capabilities.setCapability("network", "true");
		capabilities.setCapability("visual", "true");
		capabilities.setCapability("video", "true");
		capabilities.setCapability("console", "true");
		capabilities.setCapability("build", "simple_form_demo");
		
		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void simple_form_demo() throws Exception {
		try {
			driver.get("https://www.lambdatest.com/selenium-playground/");
			
			driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/ul/li[34]/a")).click();
			driver.getTitle();
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
			
			String enteredText = driver.findElementByXPath("/html/body/div/div/div/ul/li[6]/span").getText();
			if (enteredText.equals("Yey, Let's add it to list")) {
				status = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

		
	@AfterClass
	public void tearDown() throws Exception {
		if (driver != null) {
			((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
			driver.quit();
		}
	}
}
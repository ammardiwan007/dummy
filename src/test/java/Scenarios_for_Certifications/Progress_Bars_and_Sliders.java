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

public class Progress_Bars_and_Sliders{
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
	 public void  Drag_Drop_Sliders() throws Exception {
    	try {
			driver.get("https://www.lambdatest.com/selenium-playground/");
			
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[13]/a")).click();
			driver.getTitle();
			System.out.println();
						
			 {
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



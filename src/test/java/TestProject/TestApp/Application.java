package TestProject.TestApp;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import utility.Base;

public class Application extends Base
{

	
	
	
	@Test
	public void demo()
	{
		driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
		driver.navigate().back();
	}
	
	@Test
	public void animation()
	{
		driver.findElement(AppiumBy.accessibilityId("Animation")).click();
		driver.navigate().back();
	}
	
	@Test
	public void openApp()
	{
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.navigate().back();
	
	}
	
	@Test
	public void app()
	{
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.navigate().back();
	}
	
}

package utility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base 
{

	@Test
	public void startDriver() throws MalformedURLException, URISyntaxException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 4a");
		options.setApp("C:\\Users\\ymadh\\eclipse-workspace\\TestApp\\src\\main\\java\\apkfiles\\ApiDemos-debug.apk");
		
		
		
		AndroidDriver driver = new AndroidDriver(new URI( "http://127.0.0.1:4723/").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		driver.quit();
		
	
		
	}
	
	
}

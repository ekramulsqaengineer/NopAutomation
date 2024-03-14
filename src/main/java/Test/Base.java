package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		
		 //cap.setCapability(CapabilityType.VERSION,"12");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone64_x86_64");
       
        //cap.setCapability(MobileCapabilityType.UDID, "RZ8N718LH4W");
    	//cap.setCapability("appWaitForLaunch", false);
    	//cap.setCapability("appWaitDuration", 50000);
    	//cap.setCapability("autoWebview", true);
    	//cap.setCapability("autoGrantPermissions", true);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.nopstation.nopcommerce.nopstationcart");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.packageinstaller");
		//cap.setCapability("noReset",true);
	
		URL url = new URL("http://localhost:4723/wd/hub");
		
		driver = new AndroidDriver<MobileElement>(url, cap);
}
	}
	

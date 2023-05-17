import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test3 extends Test {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		// Test Case: Send Feedback Aplikasi
		
		// klik More Options (Titik 3 diujung kanan atas)
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"More options\"]").click();
						
		// klik menu Help
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout").click();
						
	
		// klik Send Feedback
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout").click();
		
		// tulis feedback
        AndroidElement element = driver.findElementById("com.google.android.gms:id/gf_issue_description");
        element.sendKeys("aplikasi sangat bagus");
        
		// klik tombol kirim 
		driver.findElementById("com.google.android.gms:id/common_send").click();
	}

}

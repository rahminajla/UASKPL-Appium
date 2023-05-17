import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test1 extends Test {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		// Test Case: Hitung Automatis
		
		// klik angka 9
		driver.findElementById("com.google.android.calculator:id/digit_9").click();
		
		// klik tanda kali (X)
		driver.findElementById("com.google.android.calculator:id/op_mul").click();
		
		// klik angka 8
		driver.findElementById("com.google.android.calculator:id/digit_8").click();
		
		// klik tanda sama dengan (=)
		driver.findElementById("com.google.android.calculator:id/eq").click();

		
		
	}

}

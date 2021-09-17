package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.out.println("launch chrome");
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");		
		new ChromeDriver();

	}

}

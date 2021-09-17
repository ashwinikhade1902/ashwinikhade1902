package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.out.println("open firefox browser");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver().close();
		FirefoxDriver driver=new FirefoxDriver();

		driver.close();

	}

}

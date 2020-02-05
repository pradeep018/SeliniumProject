package FeatureFile;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class OpeningChrome {

		
		public static void main(String[]args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Classes\\Installation\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
		

			
		}

	}






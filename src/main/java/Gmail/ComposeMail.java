package Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeMail {
	WebDriver driver;
	@BeforeMethod
	public void Launch() {
		//Launching Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Classes\\Installation\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();	
		
	}
	
	@Test(priority=1)
	public void LoginGmail() {
		//Open gmail Page
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		//Entering MailId
		driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("lingampallypradeep18@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebDriverWait wait=new WebDriverWait(driver,3000);
				
		//Entering Password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("**********");
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
			
	}
	
	@Test(dependsOnMethods="LoginGmail")
	public void ComposeMail() {
		//clock on Compose Mail
		driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
		WebDriverWait wait=new WebDriverWait(driver,3000);
		
		//Entering To Address
		driver.findElement(By.xpath("//textarea[@class=\"vO\" and @name=\"to\"]")).sendKeys("pradeep.testing714@gmail.com");
		
		//Entering Subject
		driver.findElement(By.xpath("//input[@id=\":p0\"]")).sendKeys("Composed by  Xpath");
		
		//Attach File
		driver.findElement(By.id(":1gq")).sendKeys("C:\\Users\\Dharmik-Karthik\\Desktop\\PradeepCv.doc");
		
		//Click on Send Button
		driver.findElement(By.id(":1ey")).click();
			
	}
	
	@AfterMethod
	public void Close() {
		//To Close Browser
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

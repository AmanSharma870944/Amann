package maxx_Sel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Max_Sel {
	public static void main(String args[])
	{
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\softwares\\selenium jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.maxfashion.in/in/en/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("account-actions").click();
	/*driver.findElementByName("firstName").sendKeys("Aman");
	driver.findElementById("lastName").sendKeys("Sharma");
	driver.findElementById("email").sendKeys("mannrulz.758@gmail.com");
	driver.findElementById("pwd").sendKeys("inception12");
	driver.findElementByClassName("recaptcha-checkbox-checkmark").click();
	driver.findElementByXPath("//button[contains(text(),'Sign up')]").click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByClassName("btn btn-primary btn-block").click();*/
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementByXPath("//a[@class='modal-opener flip-enable']").click();
	driver.findElementById("j_username").sendKeys("mannrulz.758@gmail.com");
	driver.findElementById("j_password").sendKeys("12345678");
	driver.findElementByXPath("//button[@id='signin-form-submit']").click();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//driver.findElementByXPath("//span[contains(text(),'MAX Start Now Full Sleeves Sweatshirt')]").click();
	//driver.findElementById("js-site-search-input").sendKeys("sunglass in Accessories");
	//driver.findElementByXPath("//button[contains(@type,'submit')][1]").click();
	
	driver.manage().window().maximize();
	WebDriverWait wait =  new WebDriverWait(driver,5); 
	//driver.findElementByLinkText("//a[@href='/in/en/MaxEOSS']").click();
	
	driver.findElementById("js-site-search-input").sendKeys("sunglass in Accessories");
	driver.findElementByXPath("//button[contains(@type,'submit')][1]").click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("prodItemImg2").click();
	driver.findElementByXPath("//span[@class='jcf-btn-inc']").click();
	driver.findElementByXPath("//button[@id='product-actions-btn-add']").click();
}
}


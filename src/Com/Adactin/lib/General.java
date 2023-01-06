package Com.Adactin.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends  Global
{
public void openApplication() 
{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com/Register.php");
		System.out.println("Application opened");
		
		//driver.findElement(By.name("Register.php")).click();

		
	}
public void titile_Verify()
{
	System.out.println("Title_Method");
	
	driver.findElement(By.name(txt_username)).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("re_password")).sendKeys(Confirmpassword);
	driver.findElement(By.name("full_name")).sendKeys(FullName);
	driver.findElement(By.name("email_add")).sendKeys(EmailAddress);
	driver.findElement(By.name("captcha")).sendKeys("museless");
	driver.findElement(By.name("tnc_box")).click();
	driver.findElement(By.name("Submit")).click();
	System.out.println("title verify");
	
}

	

}


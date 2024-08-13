

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinum\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Gender = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select dropdown = new Select(Gender);
		driver.findElement(By.cssSelector("div[class ='form-group'] input[name='name']")).sendKeys("Divya");
		driver.findElement(By.name("email")).sendKeys("divya.arianathan@perficient.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline']/input[@id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("11/20/1989");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		//String Message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText();
		//System.out.println(Message);
		//Assert.assertEquals(Message.getText(), "Success! The Form has been submitted successfully!.");
	}

}

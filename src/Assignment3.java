import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selinum\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("select[class='form-control'] option[value='consult']")).click();
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
		String Text = driver.findElement(By.cssSelector("h1.my-4")).getText();
		Assert.assertEquals(Text, "Shop Name");
		List<WebElement> ProductList = driver.findElements(By.cssSelector("div[class='col-lg-9'] h4[class='card-title']"));
		
		for(int i=0;i<ProductList.size();i++)
		{
			driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
		}
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("nav[class*='navbar-expand-lg'] div a")));
				
	}

}

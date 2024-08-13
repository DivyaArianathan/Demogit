
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	public class Assignment1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selinum\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.cssSelector("input[id*='Option2']")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Option2']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='Option2']")).click();
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='Option2']")).isSelected());
			
			//Count of Checkbox found in the page
			System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		}

	}
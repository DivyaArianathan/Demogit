import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selinum\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String selection = driver.findElement(By.cssSelector("#checkBoxOption2")).getAttribute("value");
	    System.out.println(selection);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByValue(selection);
		driver.findElement(By.id("name")).sendKeys(selection);
		driver.findElement(By.id("alertbtn")).click();
		String alertText = driver.switchTo().alert().getText();
		String Text = alertText.split(",")[0].split(" ")[1];
		Assert.assertEquals(alertText, "Hello option2, share this practice page and share your knowledge");
		System.out.println(Text);
	}

}

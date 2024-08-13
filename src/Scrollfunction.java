import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollfunction {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> Amount = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int sum=0;
		for(int i=0; i<Amount.size(); i++)
		{
			sum = sum + Integer.parseInt(Amount.get(i).getText());
		}
		System.out.println(sum);
	}

}

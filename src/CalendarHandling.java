

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class CalendarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "6";
		String day = "15";
		String year = "2026";
		String[] date = {month,day,year};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divya.arianathan\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		//String month = "January";
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		List<WebElement> dateSelected = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<dateSelected.size(); i++)
		{
			System.out.println(dateSelected.get(i).getAttribute("Value"));
			Assert.assertEquals(dateSelected.get(i).getAttribute("Value"), date[i]);
		}
		
		
	}

}

//Click checkbox in the row where Cognizant appears

package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase6 {

	@Test
	public void test6() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); // Dynamic Polymorphism

		driver.get("file:///Users/Raghu/Downloads/NewIndex.html");
		WebElement bodyList = driver.findElement(By.tagName("tbody"));
		List<WebElement> rowData = bodyList.findElements(By.tagName("tr"));

		for (int index = 0; index < rowData.size(); index++) {
			WebElement element = rowData.get(index);
			if (element.getText().contains("Cognizant")) {
				// element.findElement(By.xpath("//td/input")).click(); //want
				// to know why this is not working
				element.findElement(By.tagName("input")).click();
			}

		}

		Thread.sleep(1000);
		// driver.quit();
	}
}

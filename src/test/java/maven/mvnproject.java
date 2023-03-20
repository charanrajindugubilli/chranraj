package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mvnproject {
	@Test
	public void sampleTest() {
		WebDriverManager.chromedriver().setup();
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments(" --remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
}
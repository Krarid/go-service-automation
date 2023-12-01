package hugo;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public void main()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("http://localhost:1313/");
	}
}

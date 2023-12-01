package hugo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	private WebDriver driver;
	private String title;
	
	@Given("I visit Golang webpage")
	public void visitGolangPage()
	{	
		driver = WebDriverManager.chromedriver().create();
		driver.get("http://localhost:1313/");
	}
	
	@When("I read the title of the page")
	public void readTitleOfThePage()
	{
		title = driver.findElement(By.tagName("h1")).getText();
		System.out.println(title);
	}
	
	@Then("I verify the title of the page is {string}")
	public void verifyTitle(String title)
	{
		Assert.assertEquals(title, "This site was created with Golang");
	}
}

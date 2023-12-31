package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				plugin = {"pretty", "html:target/report/report.html", "json:target/report/cucu_json_report.json", "junit:target/report/cucumber_junit_report.xml",
						"rerun:target/report/failed.txt"},
				features = {"src/test/resources/steps"},
				glue = {"steps"},
				tags = "@Hugo"
				)
public class TestRunner extends AbstractTestNGCucumberTests {

}
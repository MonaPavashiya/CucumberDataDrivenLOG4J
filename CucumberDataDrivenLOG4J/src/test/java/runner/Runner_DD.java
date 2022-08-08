package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/mS/Documents/Mona_QA_Programs_Eclipse/CucumberDataDriven/src/test/resources/Features/Login_DD.feature",
                 glue = "stepDefinitions",
                 monochrome = true,
                		 plugin = {"pretty","html:target/HtmlReports/report.html",
                        		 "json:target/JsonReports/report.json",
                        		 "junit:target/JUnitReports/report.xml"}
                 )
public class Runner_DD {

}

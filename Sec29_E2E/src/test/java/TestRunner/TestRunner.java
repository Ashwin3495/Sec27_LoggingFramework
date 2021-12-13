package TestRunner;

//import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}

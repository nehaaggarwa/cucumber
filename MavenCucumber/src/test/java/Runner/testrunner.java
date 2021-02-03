package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"Login"},glue= {"StepDefinition"},tags="@InvalidCase", monochrome=true,dryRun=false,strict=true)
public class testrunner {

}

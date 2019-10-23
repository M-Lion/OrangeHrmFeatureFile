package OrangeHrmFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = ".", tags = "@login, @login1")

public class RunTest {
}

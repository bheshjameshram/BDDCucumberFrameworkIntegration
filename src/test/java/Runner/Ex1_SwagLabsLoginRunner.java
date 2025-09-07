package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\HP\\IdeaProjects\\BDDCucumberFrameworkIntegration\\src\\test\\java\\Features\\Ex1_LoginToSwaglag.feature",
        glue = {"Steps","Hooks"}
)
public class Ex1_SwagLabsLoginRunner extends AbstractTestNGCucumberTests
{
}

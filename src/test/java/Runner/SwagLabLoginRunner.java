package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
       //features = "C:\\Users\\HP\\IdeaProjects\\BDDCucumberFrameworkIntegration\\src\\test\\java\\Features\\Ex1_LoginToSwagLabs.feature",
       // features = "C:\\Users\\HP\\IdeaProjects\\BDDCucumberFrameworkIntegration\\src\\test\\java\\Features\\Ex2_SawagLabProduct.feature",
        features = "C:\\Users\\HP\\IdeaProjects\\BDDCucumberFrameworkIntegration\\src\\test\\java\\Features\\Ex3_SwagLabsPlaceOrderE2E.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabLoginReport.html"}


)
public class SwagLabLoginRunner extends AbstractTestNGCucumberTests
{

}

package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features/ "},
        glue = {"stepdefinition", "commons"},
        tags = {"@listaUsuario"},
        dryRun = false,
        monochrome = true,
        plugin = {"report.ExtentCucumberFormatter:"})
public class RunnerTest {
}
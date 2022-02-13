package dafiti.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "dafiti.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE,
dryRun = false)

public class DafitiRunner {
}

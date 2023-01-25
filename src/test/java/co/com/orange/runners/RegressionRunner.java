package co.com.orange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = {"src/test/resources/features/pim.feature","src/test/resources/features/login.feature"},
        glue = {"co.com.orange.stepdefinitions", "co.com.orange.util"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Regression"
)

public class RegressionRunner {
}

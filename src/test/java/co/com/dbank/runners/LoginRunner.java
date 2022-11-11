package co.com.dbank.runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        features = "src/test/resources/features/login.feature",
        glue = {"co.com.dbank.stepdefinitions", "co.com.dbank.util"},
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {

}


package co.com.orange.runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = "@Regression",
        features = "src/test/resources/features/login.feature",
        glue = {"co.com.orange.stepdefinitions", "co.com.orange.util"},
        snippets = SnippetType.CAMELCASE
)

public class LoginRunner {

}


package starter.stepdefinitions;


import com.github.rjeschke.txtmark.Run;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import starter.actions.NavigateTo;
import starter.actions.Search;
import java.io.IOException;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class MyStepdefs {

    @Steps
    NavigateTo navigate;
    @Steps
    Search search;
    @Given("Sergey is researching things on the internet")
    public void sergeyIsResearchingThingsOnTheInternet() {
        navigate.gotoHomePage();
        addImage("image/11.jpeg");
    }

    private void addImage(String imagePath) {
        try {
            Serenity.recordReportData().withTitle("Image").downloadable().fromFile(Paths.get(imagePath));
        } catch (Exception ex) {
            throw new RuntimeException("Something went wrong : " + ex, ex);
        }
    }

    @When("he looks up {string}")
    public void heLooksUp(String arg0) {
        search.searchFor(arg0);
    }

    @Then("he should see information about {string}")
    public void heShouldSeeInformationAbout(String arg0) {
        assertThat(search.getPageTitle().toLowerCase()).as("Title did not contain " + arg0).contains(arg0.toLowerCase());
    }
}

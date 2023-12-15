package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class Search extends UIInteractionSteps {

    Dummy dummy;

    @Step("Search for {0}")
    public void searchFor(String searchQuery) {
        find(SearchPage.SEARCH_BAR).waitUntilVisible().sendKeys(searchQuery);
        find(SearchPage.SEARCH_BAR).submit();
        dummy.assertThisValue(false);
    }

    @Step("Get title of the page")
    public String getPageTitle() {
        return getDriver().getTitle();
    }
}
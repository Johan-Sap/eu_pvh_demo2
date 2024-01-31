package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;

public class Search extends UIInteractionSteps {

    @Step("Search for {0}")
    public void searchFor(String searchQuery) {
        find(SearchPage.SEARCH_BAR).waitUntilVisible().sendKeys(searchQuery);
        find(SearchPage.SEARCH_BAR).submit();
    }

    @Step("Search again but now for {0}")
    public void searchAgain(String searchQuery) {
        find(SearchPage.SEARCH_BAR_FORM).waitUntilVisible().clear();
        makeTestFail();
        find(SearchPage.SEARCH_BAR_FORM).waitUntilVisible().sendKeys(searchQuery);
        find(SearchPage.SEARCH_BUTTON).waitUntilVisible().click();
    }

    @Step("Get title of the page")
    public String getPageTitle() {
        return getDriver().getTitle();
    }

    @Step("Make test fail")
    public void makeTestFail() {
        assertThat(true).as("It should be false").isFalse();
    }
}

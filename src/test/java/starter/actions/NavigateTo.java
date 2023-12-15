package starter.actions;

import net.serenitybdd.annotations.Step;

import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pages.DuckDuckGoHomePage;

public class NavigateTo extends UIInteractionSteps {

    DuckDuckGoHomePage homepage;

    @Step("Navigate to the duck duck go homepage")
    public void gotoHomePage() {
        homepage.open();
    }
}

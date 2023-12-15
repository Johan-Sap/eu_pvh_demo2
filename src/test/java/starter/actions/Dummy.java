package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class Dummy extends PageObject {

    @Step("This step failes")
    public void assertThisValue(boolean assertValue) {
        assertThat(assertValue).as("This should be " + assertValue).isTrue();
    }
}

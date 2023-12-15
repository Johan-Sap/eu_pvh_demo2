package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    public static final By SEARCH_BAR = By.xpath("//input[@id='searchbox_input']");
}

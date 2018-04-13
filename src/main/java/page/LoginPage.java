package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.TAG_NAME, using = "h1")
    private WebElement pageTitle;

    @FindBy(how = How.CSS, using = ".js-username-field")
    private WebElement usernameLocator;

    @FindBy(how = How.CSS, using = ".js-password-field")
    private WebElement passwordLocator;

    @FindBy(how = How.CSS, using = "button.submit")
    private WebElement loginButtonLocator;
}

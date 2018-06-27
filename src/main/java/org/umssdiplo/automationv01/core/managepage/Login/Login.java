package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

  //  @FindBy(name = "password")
   // private WebElement passwordInputField;

    @FindBy(xpath = "/html/body/div/form[1]/div[1]/input[2]")
    private WebElement passwordInputField;

   // @FindBy(className = "loginbtn")
   // private WebElement loginBtn;

    @FindBy(xpath="/html/body/div/form[1]/button")
    private WebElement loginBtn;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        System.out.println("El valor de mi xpath es password"+passwordInputField);
        CommonEvents.clickButton(loginBtn);
        System.out.println("el valor de mi xpath es"+loginBtn);
    }
}

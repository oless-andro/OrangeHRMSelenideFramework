package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.LoginDetails;

import static com.codeborne.selenide.ClickOptions.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPage() {
    }

    public static LoginPage getInstance() {
        return new LoginPage();
    }

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("placeholder", "Password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");

    public HomePage loginToApplication(LoginDetails loginDetails) {
        USERNAME.shouldBe(visible).setValue(loginDetails.getUserName());
        PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
        LOGIN_BUTTON.shouldBe(enabled).click(usingJavaScript());
        return new HomePage();
    }
}

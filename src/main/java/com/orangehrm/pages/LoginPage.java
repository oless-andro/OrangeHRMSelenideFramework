package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("placeholder", "password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");

    public HomePage loginToApplication() {
        USERNAME.shouldBe(visible).setValue("Admin");
        PASSWORD.shouldBe(visible).setValue("admin123");
        LOGIN_BUTTON.shouldBe(enabled).click();
        return new HomePage();
    }
}

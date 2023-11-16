package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.EmployeeDetails;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EmployeeInformationPage {

    public static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText("a", "Add Employee"));
    public static final SelenideElement FIRST_NAME = $(byName("firstName"));
    public static final SelenideElement LAST_NAME = $(byName("lastName"));
    public static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
    public static final SelenideElement SAVE_BUTTON = $(byText("Save"));
    public static final SelenideElement IMAGE = $(byAttribute("type", "file"));
    public static final SelenideElement SUCCESS_MESSAGE = $$(byText("Success")).first();

    public EmployeeInformationPage addNewEmployee(EmployeeDetails employee) {
        ADD_EMPLOYEE_BUTTON.shouldBe(visible).click();
        FIRST_NAME.shouldBe(visible).setValue(employee.getFirstName());
        LAST_NAME.shouldBe(visible).setValue(employee.getLastName());
        MIDDLE_NAME.shouldBe(visible).setValue(employee.getMiddleName());
        IMAGE.shouldBe(enabled).uploadFromClasspath(employee.getProfilePicturePath());
        SAVE_BUTTON.shouldBe(enabled).click();
        return this;
    }

    public void checkWhetherEmployeeCreatedSuccessfully() {
        SUCCESS_MESSAGE.shouldHave(visible, textCaseSensitive("Success"));
    }
}

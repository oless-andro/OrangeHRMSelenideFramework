package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.LeftMenuComponentType;

import static com.orangehrm.LeftMenuComponentType.*;

public class HomePage {

    private final LeftMenuComponent leftMenuComponent;

    public HomePage() {
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public LeftMenuComponent getLeftMenuComponent() {
        return leftMenuComponent;
    }

    public EmployeeInformationPage navigateToEmployeeInformationPage() {
        this.leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
        return new EmployeeInformationPage();
    }
}

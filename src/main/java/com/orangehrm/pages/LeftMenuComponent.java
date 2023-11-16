package com.orangehrm.pages;

import com.orangehrm.LeftMenuComponentType;
import lombok.SneakyThrows;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent {


    public LeftMenuComponent selectAMenuFromLeftMenuBar(LeftMenuComponentType menuType) {
        $(byText(menuType.getMenuName())).shouldBe(enabled).click();
        return this;
    }

    @SneakyThrows
    public <T> T getInstanceOfClass(Class<T> clazz) {
        return (T) clazz.getDeclaredConstructor().newInstance();
    }
}

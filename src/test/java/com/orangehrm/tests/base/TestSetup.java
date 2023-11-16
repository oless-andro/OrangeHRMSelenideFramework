package com.orangehrm.tests.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.open;

public class TestSetup {

    @BeforeEach
    void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
}

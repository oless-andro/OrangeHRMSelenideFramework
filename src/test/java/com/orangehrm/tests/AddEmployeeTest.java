package com.orangehrm.tests;

import com.codeborne.selenide.Configuration;
import com.orangehrm.LeftMenuComponentType;
import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.entity.LoginDetails;
import com.orangehrm.pages.EmployeeInformationPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;
import com.orangehrm.tests.base.TestSetup;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.orangehrm.LeftMenuComponentType.*;

class AddEmployeeTest extends TestSetup {

    private final EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDetails();
    private final LoginDetails loginDetails = LoginTestData.getValidLoginDetails();

    @Test
    void testAddEmployee() throws InterruptedException {
        LoginPage.getInstance()
                .loginToApplication(loginDetails)
                .navigateToEmployeeInformationPage()
                .addNewEmployee(employeeDetails)
                .checkWhetherEmployeeCreatedSuccessfully();

        Thread.sleep(10000);
    }
}

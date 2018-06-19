package org.umssdiplo.automationv01.core.managepage.Employee;


import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

/**
 * @Author: Lizeth Salazar
 */

public class EmployeeList extends BasePage {

    public static final String EMPLOYEE_LIST_PATH = Constants.SSIA_BASE_URL + "/employeeList";

    public static void load(){
        ManageDriver.getInstance().getWebDriver().navigate().to(EMPLOYEE_LIST_PATH);
    }

    public static void clickNewEmployeeButton(){
        ManageDriver.getInstance().getWebDriver().findElement(By.id("NewEmployeeBtn")).click();
    }
}

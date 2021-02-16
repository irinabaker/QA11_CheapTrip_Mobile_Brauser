package com.telran.cheaptrip.tests;

import com.telran.cheaptrip.page.MainPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase{
    MainPageHelper mainPageHelper;

    @BeforeMethod
    public void initTests() {
        mainPageHelper= PageFactory.initElements(driver,MainPageHelper.class);
    }

    @Test
    public void start() {
        System.out.println("browser launch");
    }
}

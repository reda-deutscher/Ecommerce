package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hooks;

public class RegistrationPage {




    public static WebElement registerLink() {
        return Hooks.driver.findElement(By.linkText("Register"));
    }
    public static WebElement genderMale() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public static WebElement genderFemale() {
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public static WebElement firstName() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public static WebElement lastName() {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public static Select dateOfBirthDay() {
        Select day = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay"))); //Create object of the Select class
         day.selectByValue("16");

        return day;
    }

    public static Select dateOfBirthMonth() {
       Select month =new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("March");

        return month;
    }

    public static Select dateOfBirthYear() {
        Select year =new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1994");

        return year;
    }
    public static WebElement emailAddress() {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }

    public static WebElement enterCompanyName() {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public static WebElement newsletterOption() {
        return Hooks.driver.findElement(By.id("Newsletter"));
    }

    public static WebElement enterPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public static WebElement enterConfirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public static WebElement clickRegisterButton() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    // After Registration
    public static WebElement message() {
        return Hooks.driver.findElement(By.className("result"));

    }
    public static WebElement clickLogoutButton() {
        return Hooks.driver.findElement(By.className("ico-logout"));
    }
}

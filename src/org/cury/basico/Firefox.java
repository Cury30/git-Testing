package org.cury.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(final String[] args) {
        WebDriver driver;
        final String URL = "https://www.facebook.com/";

        final String firPath = System.getProperty("user.dir") + "//drivers//geckodriver";
        System.setProperty("webdriver.gecko.driver",firPath);

        driver = new FirefoxDriver();
        driver.get(URL);



        WebElement email = driver.findElement(By.cssSelector("#email"));
        WebElement password = driver.findElement(By.cssSelector("#pass"));
        WebElement botonInicio = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));

        email.sendKeys("cury39@hotmail.com");
        password.sendKeys("3g8747427p");
        driver.findElement(By.cssSelector("#u_0_2")).click();


    }
}

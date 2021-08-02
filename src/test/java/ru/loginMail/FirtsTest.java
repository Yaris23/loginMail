package ru.loginMail;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirtsTest {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Ya/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://mail.ru/");

        // Поиск инпута логина, ввод логина
        WebElement inputLogin = driver.findElement(By.className("email-input"));
        inputLogin.sendKeys("ya65433");

        // Клик по кнопке Ввести пароль
        WebElement enterPassBtn = driver.findElement(By.cssSelector(".button"));
        enterPassBtn.click();


        // Ввод пароля
        WebElement inputPass = driver.findElement(By.className("password-input"));
//        Thread.sleep(1000);

        inputPass.sendKeys(".%kK7b#LES+SX@p");

        // Клик по кнопке Войти
        WebElement enterBtn = driver.findElement(By.className("second-button"));
        enterBtn.click();

        // клик покнопке карандаш
        Thread.sleep(3000);
        WebElement composeBtn = driver.findElement(By.cssSelector("a[href='/compose/']"));
        Thread.sleep(1000);
        composeBtn.click();


        // ввод адресата
        WebElement addresInput = driver.findElement(By.className("container--H9L5q"));
        addresInput.click();
        addresInput.sendKeys("Yaris23-rabota@yandex.ru");
        addresInput.click();

        // ввод тела сообщения
        WebElement bodyMessage = driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]"));
        bodyMessage.click();
        bodyMessage.sendKeys("Привет");

        // клик по кнопке Отправить
        WebElement sendBtn = driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div[2]/div[1]/span[1]"));
        sendBtn.click();

    }

//    @After
//    public void close(){
//        driver.quit();
//    }
}

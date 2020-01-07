package org.cury.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {

    public static void main(String[] args) {
        //instanciar obejto tipo webDriver
        WebDriver driver;

        //declaracionde variables
        String baseURL = "http://newtours.demoaut.com";
        String actualURL = "";
        String expectedResult = "Welcome: Mercury Tours";

        //indicar la localizacion del archivo chromedriver
        //System.getProperty("user.dir") = C:\..\..\Testing
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver");


        //abrir el navegador
        driver = new ChromeDriver();

        //navegar hacia la pagina
        driver.get(baseURL);

        //obtener el titulo de la pagina web
        actualURL = driver.getTitle();

        //imprimir el resultado usando operador ternario
        System.out.println( actualURL.contentEquals(expectedResult) ? "Prueba aprobada " + actualURL : "Prueba fallida");

        //cerrar el navegador
        driver.close();
    }

}

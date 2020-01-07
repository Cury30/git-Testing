package org.cury.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExceptions {
    static WebDriver driver;
    public static void main(String[] args) {



        try{

            String baseURL = "http://live.demoguru99.com/index.php/tv.html";
            String actualResult = "";
            String expectedResult = "$615.00";

            String chromePath = System.getProperty("user.dir")+"//drivers//chromedriver";
            System.setProperty("webdriver.chrome.driver",chromePath);

            driver = new ChromeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();


            //click en el link TV
            driver.findElement(By.linkText("TV")).click();


            //agregar un tv al carro
            driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span")).click();


            //obtener el precio del objeto
            actualResult = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-total > span > span")).getText();

            if(actualResult.contentEquals(expectedResult))
            {
                System.out.println("Prueba aprobada, resultado: "+actualResult+" es igual a "+expectedResult);
            } else{
                System.out.println("Prueba fallida, el resultado: "+actualResult+" no es igual a"+expectedResult);
            }

        } catch(NoSuchElementException ne){
            System.err.println("No se encontro el Webelement "+ne.getMessage());
        }catch (WebDriverException we){
            System.err.println("Hubo un fallo en WebDriver "+we.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        finally {
            driver.close();
        }



    }
}

package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public void getChrome(String url) {
        //Abrindo navegador
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
        driver.get(url);
    }
}
    /*public void getUrl(String url){
        driver.get(url);
    }
    public void tearDown(){
        driver.close();
    }
    */
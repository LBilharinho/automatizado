package automatizado.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver-v11205615.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void devePesquisarNoGoogle(){
        iniciar();

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        String resultado =driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

        driver.quit();


    }
    
}

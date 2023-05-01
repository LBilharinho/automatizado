package automatizado.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends baseTest {

    @Test
    public void devePesquisarNoGoogle(){

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("batata frita" + Keys.ENTER);
        String resultado =driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

    @Test
    public void devePesquisarNoGoogle2(){

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("hamburguer" + Keys.ENTER);
        String resultado =driver.findElement(By.id("result-stats")).getText();

        assertTrue(resultado, resultado.contains("Aproximadamente"));

    }

    
}

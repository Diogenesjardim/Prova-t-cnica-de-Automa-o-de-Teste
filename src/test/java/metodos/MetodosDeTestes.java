package metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import conexoes.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	public void escrever(By elementos, String texto) {
		driver.findElement(elementos).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);

	}
	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void esperarElemento(By elemento) {
		WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public void pesquisar(By elemento) {
		driver.findElement(elemento).getText();
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
}

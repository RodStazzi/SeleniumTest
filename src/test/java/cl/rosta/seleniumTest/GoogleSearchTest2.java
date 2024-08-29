package cl.rosta.seleniumTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoogleSearchTest2 {

	    @Autowired
	    private WebDriver webDriver;

	    @BeforeEach
	    public void setUp() {
	        webDriver.get("https://www.google.com");
	    }

	    @Test
	    public void testGoogleSearch() {
	        // Buscar el cuadro de búsqueda y realizar una búsqueda
	        WebElement searchBox = webDriver.findElement(By.name("q"));
	        searchBox.sendKeys("Spring Boot");
	        searchBox.submit();

	        // Esperar a que los resultados se carguen
	        WebElement results = webDriver.findElement(By.id("search"));
	        assertTrue(results.isDisplayed(), "Los resultados de búsqueda no se muestran.");

	        // Validar que el título de la página contiene "Spring Boot"
	        assertTrue(webDriver.getTitle().contains("Spring Boot"), "El título de la página no contiene 'Spring Boot'.");

	        // Validar que hay resultados de búsqueda
	        List<WebElement> searchResults = webDriver.findElements(By.cssSelector("div.g"));
	        assertTrue(searchResults.size() > 0, "No se encontraron resultados de búsqueda.");

	        // Validar que el primer resultado contiene el texto "Spring Boot"
	        WebElement firstResult = searchResults.get(0);
	        assertTrue(firstResult.getText().contains("Spring Boot"), "El primer resultado no contiene 'Spring Boot'.");
	    }

	    @AfterEach
	    public void tearDown() {
	        webDriver.quit();
	    }
	}
package cl.rosta.seleniumTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoogleSearchTest {

    @Autowired
    private WebDriver webDriver;

    @BeforeEach
    public void setUp() {
        webDriver.get("https://www.google.com");
    }

    @Test
    public void testGoogleSearch() {
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Spring Boot");
        searchBox.submit();

        // Esperar a que los resultados se carguen
        WebElement results = webDriver.findElement(By.id("search"));
        assert(results.isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        webDriver.quit();
    }
}
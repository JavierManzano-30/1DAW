package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class TC2_AddJobTitleTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        loginBtn.click();
    }

    @Test
    public void addJobTitle() {
        try {
            // Navegar a Admin -> Job -> Job Titles
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Job']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Job Titles']"))).click();

            // Hacer clic en Add
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add']"))).click();

            // Rellenar campos
            WebElement jobTitleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("jobTitle[jobTitle]")));
            jobTitleInput.sendKeys("Limpiador");

            WebElement descriptionInput = driver.findElement(By.name("jobTitle[jobDescription]"));
            descriptionInput.sendKeys("Persona que limpia");

            // No rellenamos nota

            // Guardar
            WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
            saveButton.click();

            // Comprobar si aparece en la lista
            By nuevoJobLocator = By.xpath("//div[contains(text(), 'Limpiador')]");
            wait.until(ExpectedConditions.visibilityOfElementLocated(nuevoJobLocator));

            WebElement addedJob = driver.findElement(nuevoJobLocator);
            Assert.assertTrue(addedJob.isDisplayed(), "El nuevo título 'Limpiador' no aparece en la lista.");

        } catch (Exception e) {
            tomarCapturaPantalla("error_addJobTitle");
            Assert.fail("Fallo en el test de agregar título de trabajo: " + e.getMessage());
        }
    }

    public void tomarCapturaPantalla(String nombreArchivo) {
        try {
            if (((RemoteWebDriver) driver).getSessionId() != null) {
                File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(srcFile, new File("./screenshots/" + nombreArchivo + ".png"));
            } else {
                System.out.println("No se tomó captura porque la sesión del navegador ya no es válida.");
            }
        } catch (IOException | WebDriverException e) {
            System.out.println("Error al tomar captura de pantalla: " + e.getMessage());
        }
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                System.out.println("Error cerrando el navegador: " + e.getMessage());
            }
        }
    }
}

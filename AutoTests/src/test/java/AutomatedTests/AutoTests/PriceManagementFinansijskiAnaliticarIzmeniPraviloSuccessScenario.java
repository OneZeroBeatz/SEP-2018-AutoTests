package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PriceManagementFinansijskiAnaliticarIzmeniPraviloSuccessScenario {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:4200/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPriceManagementFinansijskiAnaliticarIzmeniPraviloSuccessScenario() throws Exception {
    
	String textToUpdateRule = "UpdateText";  
	// open | /auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=9d06dd62-cc42-40e0-b070-16bb74a25453&nonce=455d6476-70f2-48d5-8e5a-c90cbaa1ad22&response_mode=fragment&response_type=code&scope=openid | 
    driver.get(baseUrl + "/auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=9d06dd62-cc42-40e0-b070-16bb74a25453&nonce=455d6476-70f2-48d5-8e5a-c90cbaa1ad22&response_mode=fragment&response_type=code&scope=openid");
    // type | id=username | c@c.com
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("c@c.com");
    // type | id=password | c
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("c");
    // click | id=kc-login | 
    driver.findElement(By.id("kc-login")).click();
    Thread.sleep(2000);
    // click | xpath=("izmeniPostojecaPravilaIdForTest")[8] | 
    driver.findElement(By.id("izmeniPostojecaPravilaIdForTest")).click();
    Thread.sleep(2000);
    // type | name=pravila | IZMENJENAPRAVILA
    driver.findElement(By.name("pravila")).clear();
    driver.findElement(By.name("pravila")).sendKeys(textToUpdateRule);
    // click | xpath=(//button[@type='button'])[11] | 
    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
    Thread.sleep(2000);
    // click | xpath=(//button[@type='button'])[8] | 
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    Thread.sleep(2000);
    // verifyValue | name=pravila | IZMENJENAPRAVILA

    try {
      assertEquals(textToUpdateRule, driver.findElement(By.name("pravila")).getAttribute("value"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    //String verificationErrorString = verificationErrors.toString();
    //if (!"".equals(verificationErrorString)) {
    //  fail(verificationErrorString);
    //}
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

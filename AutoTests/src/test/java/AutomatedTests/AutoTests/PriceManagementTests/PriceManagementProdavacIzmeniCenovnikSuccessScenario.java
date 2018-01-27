package AutomatedTests.AutoTests.PriceManagementTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PriceManagementProdavacIzmeniCenovnikSuccessScenario {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:4200/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPriceManagementProdavacIzmeniCenovnikSuccessScenario() throws Exception {
   
	String stringToEditField = "222";  
	// open | /auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=669a5d21-9962-475a-8570-c2b1c11e397f&nonce=f06bdb65-9bda-447b-8de7-b5899feb2cd4&response_mode=fragment&response_type=code&scope=openid | 
    driver.get(baseUrl + "/auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=669a5d21-9962-475a-8570-c2b1c11e397f&nonce=f06bdb65-9bda-447b-8de7-b5899feb2cd4&response_mode=fragment&response_type=code&scope=openid");
    // type | id=username | c@c.com
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("b@b.com");
    // type | id=password | c
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("b");
    // click | id=kc-login | 
    driver.findElement(By.id("kc-login")).click();
    Thread.sleep(2000);
    // click | xpath=(//button[@type='button'])[5] | 
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();

    Thread.sleep(2000);
    // click | //tr[3]/button | 
    driver.findElement(By.xpath("//tr[2]/button")).click();

    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    
    Thread.sleep(1000);
    // type | //input[@type='number'] | 909090909090

    // type | name=datumOd | 2018-11-11
    driver.findElement(By.name("datumOd")).clear();
    driver.findElement(By.name("datumOd")).sendKeys("2013-11-11");
    // type | name=datumDo | 2018-12-12
    driver.findElement(By.name("datumDo")).clear();
    driver.findElement(By.name("datumDo")).sendKeys("2013-12-12");
    
    driver.findElement(By.xpath("//input[@type='number']")).clear();
    driver.findElement(By.xpath("//input[@type='number']")).sendKeys(stringToEditField);
    // click | id=izmeniCenovnikIdForTest | 
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//button[@type='button'])[3]"));
    Thread.sleep(2000);
    driver.findElement(By.id("izmeniCenovnikIdForTest")).click();

    Thread.sleep(2000);
    // assertText | //td[4] | 909090909090
    assertEquals(stringToEditField, driver.findElement(By.xpath("//tr[11]/td[4]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
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

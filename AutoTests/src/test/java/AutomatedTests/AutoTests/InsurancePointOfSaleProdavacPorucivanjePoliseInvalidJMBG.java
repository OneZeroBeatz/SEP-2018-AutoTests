package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsurancePointOfSaleProdavacPorucivanjePoliseInvalidJMBG {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:4201/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInsurancePointOfSaleProdavacPorucivanjePoliseInvalidJMBG() throws Exception {
    // open | / | 
	driver.get(baseUrl + "/auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4201%2F&state=f9e5e301-3e95-4a32-a362-e1da542cf891&nonce=b5ed7a2e-2932-45ba-8139-bfb99b096696&response_mode=fragment&response_type=code&scope=openid");
	driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("b@b.com");
    // type | id=password | b
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("b");
	// click | id=kc-login | 
	driver.findElement(By.id("kc-login")).click();
	Thread.sleep(3000);
	// click | xpath=(//button[@type='button'])[2] | 
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    // type | css=input.form-control | one@gmail.com
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("one@gmail.com");
    // type | //input[@type='TEXT'] | Jova
    driver.findElement(By.xpath("//input[@type='TEXT']")).clear();
    driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("Jova");
    // type | xpath=(//input[@type='TEXT'])[2] | Jovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Jovic");
    // type | //input[@type='NUMBER'] | 98
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("98");
    // type | xpath=(//input[@type='NUMBER'])[2] | 9899
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("9899");
    // type | xpath=(//input[@type='TEXT'])[3] | Adr 33
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Adr 33");
    // click | //button[2] | 
    driver.findElement(By.xpath("//button[2]")).click();
    // assertText | //div[4]/div[2] | Minimalan broj karaktera je: 13
    assertEquals("Minimalan broj karaktera je: 13", driver.findElement(By.xpath("//div[4]/div[2]")).getText());
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

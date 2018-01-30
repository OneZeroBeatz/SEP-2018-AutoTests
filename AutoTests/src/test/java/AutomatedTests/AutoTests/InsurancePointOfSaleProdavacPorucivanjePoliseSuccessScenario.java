package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsurancePointOfSaleProdavacPorucivanjePoliseSuccessScenario {
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
  public void testInsurancePointOfSaleProdavacPorucivanjePoliseSuccessScenario() throws Exception {
    // open | /auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4201%2F&state=a91a51d6-e78f-4583-8593-82910597f692&nonce=422a77c4-7945-411d-868b-1c016d56911d&response_mode=fragment&response_type=code&scope=openid | 
    driver.get(baseUrl + "/auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4201%2F&state=a91a51d6-e78f-4583-8593-82910597f692&nonce=422a77c4-7945-411d-868b-1c016d56911d&response_mode=fragment&response_type=code&scope=openid");
    // type | id=username | b@b.com
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("b@b.com");
    // type | id=password | b
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("b");
    // click | id=kc-login | 
    driver.findElement(By.id("kc-login")).click();
    Thread.sleep(1000);
    // click | xpath=(//button[@type='button'])[2] | 
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

    Thread.sleep(1000);
    // type | css=input.form-control | b@b.com
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("b@b.com");
    // type | //input[@type='TEXT'] | Sasa
    driver.findElement(By.xpath("//input[@type='TEXT']")).clear();
    driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("Sasa");
    // type | xpath=(//input[@type='TEXT'])[2] | Momcilovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Momcilovic");
    // type | //input[@type='NUMBER'] | 8888888888888
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("8888888888888");
    // type | xpath=(//input[@type='NUMBER'])[2] | 4474
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("4474");
    // type | xpath=(//input[@type='TEXT'])[3] | Vojvodjanska 13
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Vojvodjanska 13");
    // type | xpath=(//input[@type='NUMBER'])[3] | 938429
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("938429");
    // click | //button[2] | 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[2]")).click();
    Thread.sleep(1000);
    // type | css=input.form-control | 2014-10-10
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("2014-10-10");
    // type | xpath=(//input[@type='DATE'])[2] | 2015-10-10
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).sendKeys("2015-10-10");
    // click | //button[3] | 
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[3]")).click();
    Thread.sleep(1000);
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    //Thread.sleep(2000);
    // type | css=input.form-control | 1
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("1");
    // select | css=select.form-control | label=Fudbal
    new Select(driver.findElement(By.cssSelector("select.form-control"))).selectByVisibleText("Fudbal");
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // type | css=input.form-control | Jovan
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("Jovan");
    // type | xpath=(//input[@type='TEXT'])[2] | Jovanovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Jovanovic");
    // type | //input[@type='NUMBER'] | 3838383838382
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("3838383838382");
    // type | xpath=(//input[@type='NUMBER'])[2] | 394848
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("394848");
    // type | xpath=(//input[@type='TEXT'])[3] | Vojv 4
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Vojv 4");
    // type | xpath=(//input[@type='NUMBER'])[3] | 93843
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("93843");
    // click | css=button.btn.btn-success | 

    Thread.sleep(1000);
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    
    //TODO 1: Add asserts from database
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

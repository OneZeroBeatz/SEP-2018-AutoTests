package AutomatedTests.AutoTests;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PriceManagementFinansijskiAnaliticarDodajCenovnikSuccessScenario {
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
  public void testPriceManagementFinansijskiAnaliticarDodajCenovnikSuccessScenario() throws Exception {
    String valueForAllParameters = "9";
	// open | /auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=4a641141-b911-44b0-bb61-b6c67ba26675&nonce=9f5132a0-705a-4888-82aa-4b8bc5ce1e72&response_mode=fragment&response_type=code&scope=openid | 
    driver.get(baseUrl + "/auth/realms/AuthorizationProviderKeycloak/protocol/openid-connect/auth?client_id=login-app-client&redirect_uri=http%3A%2F%2Flocalhost%3A4200%2F&state=4a641141-b911-44b0-bb61-b6c67ba26675&nonce=9f5132a0-705a-4888-82aa-4b8bc5ce1e72&response_mode=fragment&response_type=code&scope=openid");
    // type | id=username | c@c.com
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("c@c.com");
    // type | id=password | c
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("c");
    // click | id=kc-login | 
    driver.findElement(By.id("kc-login")).click();
    Thread.sleep(2000);
    // click | xpath=(//button[@type='button'])[5] | 
    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();

    Thread.sleep(2000);
    // click | //dugme za odabir selektovanog cenovnika 
    driver.findElement(By.xpath("//tr[2]/button")).click();
    // click | css=button.btn.btn-primary | 
    Thread.sleep(2000);
    driver.findElement(By.id("noviCenovnikIdForTest")).click();
    Thread.sleep(2000);
    //driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    // type | name=datumOd | 2018-11-11
    driver.findElement(By.name("datumOd")).clear();
    driver.findElement(By.name("datumOd")).sendKeys("2013-11-11");
    // type | name=datumDo | 2018-12-12
    driver.findElement(By.name("datumDo")).clear();
    driver.findElement(By.name("datumDo")).sendKeys("2013-12-12");
    // type | //input[@type='number'] | 999
    driver.findElement(By.xpath("//input[@type='number']")).clear();
    driver.findElement(By.xpath("//input[@type='number']")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[2] | 999
    driver.findElement(By.xpath("(//input[@type='number'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[3] | 999
    driver.findElement(By.xpath("(//input[@type='number'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[4] | 999
    driver.findElement(By.xpath("(//input[@type='number'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[4]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[5] | 999
    driver.findElement(By.xpath("(//input[@type='number'])[5]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[6] | 999
    driver.findElement(By.xpath("(//input[@type='number'])[6]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[6]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[7] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[7]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[7]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[8] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[8]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[8]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[9] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[9]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[9]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[10] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[10]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[10]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[11] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[11]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[11]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[12] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[12]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[12]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[13] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[13]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[13]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[14] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[14]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[14]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[15] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[15]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[15]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[16] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[16]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[16]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[17] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[17]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[17]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[18] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[18]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[18]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[19] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[19]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[19]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[20] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[20]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[20]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[21] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[21]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[21]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[22] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[22]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[22]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[23] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[23]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[23]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[24] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[24]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[24]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[25] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[25]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[25]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[26] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[26]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[26]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[27] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[27]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[27]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[28] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[28]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[28]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[29] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[29]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[29]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[30] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[30]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[30]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[31] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[31]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[31]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[32] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[32]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[32]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[33] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[33]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[33]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[34] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[34]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[34]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[35] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[35]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[35]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[36] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[36]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[36]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[37] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[37]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[37]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[38] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[38]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[38]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[39] | 9
    driver.findElement(By.xpath("(//input[@type='number'])[39]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[39]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[40] | 8
    driver.findElement(By.xpath("(//input[@type='number'])[40]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[40]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[41] | 8
    driver.findElement(By.xpath("(//input[@type='number'])[41]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[41]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[42] | 8
    driver.findElement(By.xpath("(//input[@type='number'])[42]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[42]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[43] | 8
    driver.findElement(By.xpath("(//input[@type='number'])[43]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[43]")).sendKeys(valueForAllParameters);
    // type | xpath=(//input[@type='number'])[44] | 8
    driver.findElement(By.xpath("(//input[@type='number'])[44]")).clear();
    driver.findElement(By.xpath("(//input[@type='number'])[44]")).sendKeys(valueForAllParameters);
    Thread.sleep(2000);
    // click | css=div.modal-footer > button.btn.btn-success | 
    //driver.findElement(By.cssSelector("div.modal-footer > button.btn.btn-success")).click();
    driver.findElement(By.id("kreirajCenovnikIdForTest")).click();
    Thread.sleep(2000);
    // assertText | //td[4] | 999
    assertEquals(valueForAllParameters, driver.findElement(By.xpath("//td[4]")).getText());
    // assertText | //tr[3]/td[4] | 999
    assertEquals(valueForAllParameters, driver.findElement(By.xpath("//tr[3]/td[4]")).getText());
    // assertText | //tr[45]/td[4] | 8
    assertEquals(valueForAllParameters, driver.findElement(By.xpath("//tr[45]/td[4]")).getText());
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

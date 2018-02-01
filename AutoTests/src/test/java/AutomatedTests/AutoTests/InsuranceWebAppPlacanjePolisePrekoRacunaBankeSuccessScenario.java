package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceWebAppPlacanjePolisePrekoRacunaBankeSuccessScenario {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:1000/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInsuranceWebAppPlacanjePolisePrekoRacunaBankeSuccessScenario() throws Exception {
    // open | /osiguravajuceKuce | 
    driver.get(baseUrl + "/osiguravajuceKuce");
    // click | link=Sajt | 
    driver.findElement(By.linkText("Sajt")).click();
    // click | link=Kupi osiguranje | 
    driver.findElement(By.linkText("Kupi osiguranje")).click();
    // click | css=button.btn.btn-primary | 
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    // type | css=input.form-control | onezerobeatz@gmail.com
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("onezerobeatz@gmail.com");
    // type | //input[@type='TEXT'] | Sasa
    driver.findElement(By.xpath("//input[@type='TEXT']")).clear();
    driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("Sasa");
    // type | xpath=(//input[@type='TEXT'])[2] | Momci
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Momci");
    // type | //input[@type='NUMBER'] | 9999999999999
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("9999999999999");
    // type | xpath=(//input[@type='NUMBER'])[2] | 3939
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("3939");
    // type | xpath=(//input[@type='TEXT'])[3] | Ad 
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Ad");
    // type | xpath=(//input[@type='NUMBER'])[3] | 3333
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("3333");
    // click | //button[2] | 
    driver.findElement(By.xpath("//button[2]")).click();
    // type | css=input.form-control | 2013-12-12
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("2013-12-12");
    // type | xpath=(//input[@type='DATE'])[2] | 2014-12-12
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='DATE'])[2]")).sendKeys("2014-12-12");
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // type | css=input.form-control | 1
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("1");
    // click | //button[3] | 
    driver.findElement(By.xpath("//button[3]")).click();
    // type | css=input.form-control | Jovan
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("Jovan");
    // type | xpath=(//input[@type='TEXT'])[2] | Jovanovic
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[2]")).sendKeys("Jovanovic");
    // type | //input[@type='NUMBER'] | 9292929292929
    driver.findElement(By.xpath("//input[@type='NUMBER']")).clear();
    driver.findElement(By.xpath("//input[@type='NUMBER']")).sendKeys("9292929292929");
    // type | xpath=(//input[@type='NUMBER'])[2] | 9292
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[2]")).sendKeys("9292");
    // type | xpath=(//input[@type='TEXT'])[3] | Ad 3
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='TEXT'])[3]")).sendKeys("Ad 3");
    // type | xpath=(//input[@type='NUMBER'])[3] | 333
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='NUMBER'])[3]")).sendKeys("333");
    // click | css=button.btn.btn-success | 
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    // click | //div[2]/div/p[2]/button | 
    driver.findElement(By.xpath("//div[2]/div/p[2]/button")).click();
    // type | id=card-holder-name | Sta god
    driver.findElement(By.id("card-holder-name")).clear();
    driver.findElement(By.id("card-holder-name")).sendKeys("Sta god");
    // type | id=card-number | 111-4567-890
    driver.findElement(By.id("card-number")).clear();
    driver.findElement(By.id("card-number")).sendKeys("111-4567-890");
    // type | id=cvv | 123
    driver.findElement(By.id("cvv")).clear();
    driver.findElement(By.id("cvv")).sendKeys("123");
    // select | id=expiry-month | label=Mar (03)
    new Select(driver.findElement(By.id("expiry-month"))).selectByVisibleText("Mar (03)");
    // select | name=expiry-year | label=2017
    new Select(driver.findElement(By.name("expiry-year"))).selectByVisibleText("2017");
    // click | css=button.btn.btn-success | 
    driver.findElement(By.cssSelector("button.btn.btn-success")).click();
    Thread.sleep(3000);
    assertEquals("InsuranceWebAppClient", driver.getTitle());
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

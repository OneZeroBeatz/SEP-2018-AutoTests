package AutomatedTests.AutoTests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PriceManagementProdavacPrikaziCenovnikeNaDanasnjiDatumSuccessScenario {
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
  public void testPriceManagementProdavacIzmeniCenovnikSuccessScenario() throws Exception {
   
	String stringToEditField = "22992";  
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
    String datumOd = "2015-01-01";
    String datumDo = "2019-01-01";
    // type | name=datumOd | 2018-11-11
    driver.findElement(By.name("datumOd")).clear();
    driver.findElement(By.name("datumOd")).sendKeys(datumOd);
    // type | name=datumDo | 2018-12-12
    driver.findElement(By.name("datumDo")).clear();
    driver.findElement(By.name("datumDo")).sendKeys(datumDo);
    
    // click | id=izmeniCenovnikIdForTest | 
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//button[@type='button'])[3]"));
    Thread.sleep(2000);
    driver.findElement(By.id("izmeniCenovnikIdForTest")).click();

    Thread.sleep(1000);
    // click | id=prikaziCenovnikePoDatumuIdForTest | 
    driver.findElement(By.id("prikaziCenovnikePoDatumuIdForTest")).click();
    // assertText | //div[2]/table/tbody/tr[2]/td[3] | October 12, 2019
    assertEquals("January 1, 2019", driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[3]")).getText());
    // assertText | //div[2]/table/tbody/tr[2]/td[2] | January 1, 2015
    assertEquals("January 1, 2015", driver.findElement(By.xpath("//div[2]/table/tbody/tr[2]/td[2]")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }




}

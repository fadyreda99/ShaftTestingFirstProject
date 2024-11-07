import com.shaft.driver.SHAFT;
import com.shaft.tools.io.JSONFileManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class FullCycleTest {
    private SHAFT.GUI.WebDriver driver;
    private JSONFileManager testData;

    @BeforeClass
    public void beforeClass(){
        testData = new JSONFileManager("TestData.json");
    }

    @BeforeMethod
    public void setup(){
        driver = new SHAFT.GUI.WebDriver();

    }

    @org.testng.annotations.Test
    public void tests(){
        new TestPages(driver).navigateToURL(testData.getTestData("url"))
                .clickOnSigninBtn().typeCreateEmail(testData.getTestData("email"))
                .clickOnCreateAccountBtn().checkedOnRadioBtn().typeFirstName(testData.getTestData("name.firstName"))
                .typeLastName(testData.getTestData("name.lastName"))
                .typePassword(testData.getTestData("password"))
                .selectDays(testData.getTestData("birthDate.days"))
                .selectMonth(testData.getTestData("birthDate.month"))
                .selectYear(testData.getTestData("birthDate.year"))
                .checkedOnNewsLetterCheckBox().clickOnRegisterBtn()
                .clickOnLogOut().typeLoginEmail(testData.getTestData("email"))
                .typeLoginPassword(testData.getTestData("password"))
                .clickOnLoginBtn().typeInSearchField(testData.getTestData("searchTxt"))
                .clickOnSearchBtn().hoverOnItem().clickOnMoreBtn()
                .selectSize(testData.getTestData("size"))
                .clickOnAddToCartBtn().clickOnProceedToCheckOutBtn()
                .validateOnProductName(testData.getTestData("product.name"))
                .validateOnQtyField(testData.getTestData("product.qty"))
                .validateOnTotal(testData.getTestData("product.total"));

    }


    @AfterMethod
    public void tearDown(){
        driver.browser().closeCurrentWindow();
    }
}

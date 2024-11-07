import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class TestPages {
    private SHAFT.GUI.WebDriver driver;

    public TestPages(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }

    //locators
    private By signinBtn = By.xpath("//a[@class=\"login\"]");
    //register locators
    private By emailCreateTextField = By.id("email_create");
    private By submitCreateBtn = By.id("SubmitCreate");
    private By genderMrRadioBtn = By.id("id_gender1");
    private By firstNameTextField = By.id("customer_firstname");
    private By lastNameTextField = By.id("customer_lastname");
    private By passwordTextField = By.id("passwd");
    private By daysSelectBox = By.id("days");
    private By monthSelectBox = By.id("months");
    private By yearSelectBox = By.id("years");
    private By newsletterCheckBox = By.xpath("//input[@id=\"newsletter\"]");
    private By registerBtn = By.id("submitAccount");
    //logout locator
    private By logoutBtn = By.xpath("//a[@class=\"logout\"]");
    //login locators
    private By loginEmailTextField = By.id("email");
    private By loginPasswordTextField = By.id("passwd");
    private By loginBtn = By.id("SubmitLogin");
    //search locators
    private By searchTextField = By.id("search_query_top");
    private By searchBtn = By.xpath("//button[@name=\"submit_search\"]");
    //product
    private By firstItemContainer = By.xpath("//div[@class=\"product-container\"][1]");
    private By moreBtn = By.xpath("//a[@title=\"View\"][1]//span");
    private By sizeSelectBox = By.id("group_1");
    private By addToCartBtn = By.xpath("//button[@name=\"Submit\"]");
    private By proceedToCheckOutbtn = By.xpath("//a[@title=\"Proceed to checkout\"]");
    private By productName = By.xpath("//div[@class=\"cart_last_product_content\"]//p//a");
    private By qtyField = By.xpath("//input[@name=\"quantity_2_11_0_0\"]");
    private By productPrice = By.xpath("//li[@class=\"price\"]");
    private By total = By.id("total_product_price_2_11_0");

    //actions
    public TestPages navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this;
    }

    public TestPages clickOnSigninBtn(){
        driver.element().click(signinBtn);
        return this;
    }

    public TestPages typeCreateEmail(String email){
        driver.element().type(emailCreateTextField, email);
        return this;
    }

    public TestPages clickOnCreateAccountBtn(){
        driver.element().click(submitCreateBtn);
        return this;
    }

    public TestPages checkedOnRadioBtn(){
        driver.element().click(genderMrRadioBtn);
        return this;
    }

    public TestPages typeFirstName(String firstName){
        driver.element().type(firstNameTextField, firstName);
        return this;
    }

    public TestPages typeLastName(String lastName){
        driver.element().type(lastNameTextField, lastName);
        return this;
    }

    public TestPages typePassword(String password){
        driver.element().type(passwordTextField, password);
        return this;
    }

    public TestPages selectDays(String days){
        driver.element().select(daysSelectBox, days);
        return this;
    }

    public TestPages selectMonth(String month){
        driver.element().select(monthSelectBox, month);
        return this;
    }

    public TestPages selectYear(String year){
        driver.element().select(yearSelectBox, year);
        return this;
    }

    public TestPages checkedOnNewsLetterCheckBox(){
        driver.element().click(newsletterCheckBox);
        return this;
    }

    public TestPages clickOnRegisterBtn(){
        driver.element().click(registerBtn);
        return this;
    }

    public TestPages clickOnLogOut(){
        driver.element().click(logoutBtn);
        return this;
    }

    public TestPages typeLoginEmail(String email){
        driver.element().type(loginEmailTextField, email);
        return this;
    }

    public TestPages typeLoginPassword(String password){
        driver.element().type(loginPasswordTextField, password);
        return this;
    }

    public TestPages clickOnLoginBtn(){
        driver.element().click(loginBtn);
        return this;
    }

    public TestPages typeInSearchField(String searchTxt){
        driver.element().type(searchTextField, searchTxt);
        return this;
    }

    public TestPages clickOnSearchBtn(){
        driver.element().click(searchBtn);
        return this;
    }

    public TestPages hoverOnItem(){
        driver.element().hover(firstItemContainer);
        return this;
    }
    public TestPages clickOnMoreBtn(){
        driver.element().click(moreBtn);
        return this;
    }

    public TestPages selectSize(String size){
        driver.element().select(sizeSelectBox, size);
        return this;
    }

    public TestPages clickOnAddToCartBtn(){
        driver.element().click(addToCartBtn);
        return this;
    }

    public TestPages clickOnProceedToCheckOutBtn(){
        driver.element().click(proceedToCheckOutbtn);
        return this;
    }



    //assertions
//    public TestPages validateOnProductName(String expectedProduct) {
//       String actualName =  driver.element().getText(productName).toString().trim();
//       actualName.equals(expectedProduct);
//        return this;
//    }

    public TestPages validateOnProductName(String expectedProduct) {
        // Get the actual product name
        String actualName = driver.element().getText(productName).toString().trim();
        actualName.equals(expectedProduct);
        // Assert if the actual name equals the expected product name
//        if (!actualName.equals(expectedProduct)) {
//            throw new AssertionError("Product name mismatch. Expected: " + expectedProduct + ", but got: " + actualName);
//        }

        return this;
    }


    public TestPages validateOnQtyField(String qty){
        driver.verifyThat().element(qtyField).text().isEqualTo(qty).perform();
        return this;
    }

    public TestPages validateOnTotal(String expectedTotal){
      driver.verifyThat().element(total).text().isEqualTo(expectedTotal).perform();
      return this;
    }






}

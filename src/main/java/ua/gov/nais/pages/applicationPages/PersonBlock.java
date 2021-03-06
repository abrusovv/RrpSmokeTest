package ua.gov.nais.pages.applicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.gov.nais.pages.MotherPage;
import ua.gov.nais.utilities.ActionsWithElements;

import java.util.ArrayList;
import java.util.List;

public class PersonBlock extends MotherPage {

    @FindBy (xpath = "//span[contains(text(), \"Суб'єкт\")]")
    private WebElement personBlock;

    @FindBy (xpath = "//*[@id=\"button-1305\"]")
    //@FindBy (xpath = "//span[contains(text(), 'Додати')]/../../..")
    private WebElement addPersonButton;

    @FindBy (xpath = "//span[contains(text(), 'Фізична особа')]")
    private WebElement addPhisycalPersonButton;

    @FindBy (xpath = "//label[contains(text(), 'Роль')]")
    private WebElement roleList;

    @FindBy (xpath = "//li[contains(text(), 'Заявник')]")
    private WebElement applicantListItem;

    @FindBy (xpath = "//li[contains(text(), \"Суб’єкт права\")]")
    private WebElement personOfLawListItem;

    @FindBy (xpath = "//*[@id=\"ext-gen2032\"]")
    private WebElement closeRoleListButton;

    //@FindBy (xpath = "//*[@id=\"textfield-1510-inputEl\"]")
   //@FindBy (xpath = "//label[contains(text(), 'ПІБ')]/../..//td[2]/input")
    //@FindBy (xpath = "//label[contains(text(), 'ПІБ')]")
    //private List<WebElement> fullNameField = new ArrayList<>();

    private By fullNameLocator = By.xpath("//label[contains(text(), 'ПІБ')]/../..//td[2]/input");

    @FindBy (xpath = "//*[@id=\"textfield-1511-inputEl\"]")
    private WebElement idField;

    @FindBy (xpath = "//*[@id=\"textfield-1528-inputEl\"]")
    private WebElement passportNumberField;

    @FindBy (xpath = "")
    private WebElement passportPublisherField;

    public PersonBlock(WebDriver driver) {
        super(driver);
    }

    public void testClick(){




    }
    public void clickPersonBlockButton(){
        ActionsWithElements.init(driver).clickOnElement(personBlock);
    }
    public void clickAddPersonButton(){
        ActionsWithElements.init(driver).clickOnElement(addPersonButton);
    }
    public void clickAddPhisycalPersonButton(){
        ActionsWithElements.init(driver).clickOnElement(addPhisycalPersonButton);
    }
    public void clickRoleList(){
        ActionsWithElements.init(driver).clickOnElement(roleList);
    }
    public void addApplicantItem(){
        ActionsWithElements.init(driver).clickOnElement(applicantListItem);
    }
    public void addPersonOfLaw(){
        ActionsWithElements.init(driver).clickOnElement(personOfLawListItem);
    }
    public void clickCloseRoleList(){
        ActionsWithElements.init(driver).clickOnElement(closeRoleListButton);
    }
    public void enterFullName(){
        List <WebElement> list = driver.findElements(fullNameLocator);
        ActionsWithElements.init(driver).enterTextInToInput(list.get(3), "наме");
    }

}

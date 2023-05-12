package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobtitle;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationSelect;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobtype;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobs;

    public void acceptCookies() throws InterruptedException {
        Thread.sleep(800);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
        Reporter.log("Accept All Cookies : ");
        CustomListeners.test.log(Status.PASS, "Accept All Cookies.");
    }
    public void enterJobTitle(String jobTitle){
        Reporter.log("Enter Job Title" + jobTitle + "to Job Title field " + jobtitle.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job Title " + jobTitle);
        sendTextToElement(jobtitle,jobTitle);
    }
    public void enterLocation(String location){
        Reporter.log("Enter Location" + location + "to Location field" + locationSelect.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job Title " + location);
        sendTextToElement(locationSelect,location);
    }
    public void selectDistance(String distance){
        Reporter.log("Select Distance" + distance + "from select drop down" + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Distance" + distance);
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        Reporter.log("Click on More Search option " + moreSearchOptions.toString());
        CustomListeners.test.log(Status.PASS, "Click on More Search option");
        clickOnElement(moreSearchOptions);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter Minimum Salary " + minSalary + "to min salary field" + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "Enter Minimum Salary" + minSalary);
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter Maximum Salary " + maxSalary + "to max salary field" + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "Enter Maximum Salary" + maxSalary);
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        Reporter.log("Select Salary Type" + sType + "from select drop down" + salaryType.toString());
        CustomListeners.test.log(Status.PASS, "Select Salary Type" + sType);
        selectByVisibleTextFromDropDown(salaryType,sType);
    }
    public void selectJobType(String jobType){
        Reporter.log("Select Job Type" + jobType + "from select drop down" + jobtype.toString());
        CustomListeners.test.log(Status.PASS, "Select Job Type" + jobType);
        selectByVisibleTextFromDropDown(jobtype,jobType);
    }
    public void clickOnFindJobsButton(){
        Reporter.log("Click on Find Jobs button" + findJobs.toString());
        CustomListeners.test.log(Status.PASS, "Click on Find Jobs button");
        clickOnElement(findJobs);
    }
}

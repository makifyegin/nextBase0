package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrTaskPage extends LoginPage {




    public HrTaskPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Tasks']")
    public WebElement taskButton;

    @FindBy(xpath = "//a[@href='/company/personal/user/693/tasks/?F_CANCEL=Y&F_SECTION=ADVANCED&clear_filter=Y&apply_filter=Y']")
    public WebElement allButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement ongoingButton;


    @FindBy(xpath = "(//div[@class=\"main-ui-square-item\"])[2]")
    public WebElement roleOngoing;

    @FindBy(xpath = "//a[@id='tasks-buttonAdd']")
    public WebElement newTaskButton;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement newTaskPage;

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement newTaskPageIframe;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement thingsToDo;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textArea;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textAreaIframe;


    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement deadline;


    @FindBy(xpath = "//div[@class='bx-calendar-month-content'] //span")
    public WebElement months;

    @FindBy(xpath = " //a[@data-date='1657411200000']")
    public WebElement days;

    @FindBy(xpath = "(//span[@class=\"bx-calendar-button-text\"])[1]")
    public WebElement selectButton;


    @FindBy(xpath = "//div[@class='task-additional-alt-more']")
    public WebElement clickMore;


    @FindBy(xpath = "(//a[@href='javascript:void(0);'])[10]")
    public WebElement projectAddButton;



    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement soccerTeam;


    @FindBy(xpath = "//span[@data-bx-id='task-edit-cmd']")
    public WebElement addTaskEnter;

    @FindBy(className = "tasks-grid-group-link")
    public WebElement underSoccerTeamCreatedTask;


    @FindBy(xpath = "//div[@class='task-message-label error']")
    public WebElement newTaskErrorMessage;

    @FindBy(xpath = "//a[@class='bx-calendar-left-arrow']")
    public WebElement calendarLeftButton;

    @FindBy(xpath = " //a[@data-date='1654819200000']")
    public WebElement date10ThJun;


    @FindBy(xpath = "(//span[@class='tasks-counter-text'])[2]")
    public WebElement overDueButton;


    @FindBy(xpath = " //a[@href='/company/personal/user/693/tasks/task/view/974/']")
    public WebElement lastTaskAssertion;

    //input[@id="tasks-task-priority-cb"]
    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriority;

    @FindBy(xpath = "(//span[@data-target='originator'])[1]")
    public WebElement createdByButton;

    @FindBy(xpath = "//a[@data-date='1659225600000']")
    public WebElement getDate31ThJun;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'])[1]")
    public WebElement addMoreResponsible;



    @FindBy(xpath = "//input[@data-target='allow-time-tracking']")
    public WebElement timeTrackingButton;

    @FindBy(xpath = "//div[contains(text(),'hr78@cybertekschool.com')]")
    public WebElement responsiblePersonHR;


    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement responsiblePersonPopUpButton;





















}

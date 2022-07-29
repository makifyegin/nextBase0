package com.nextBase.pages;

import com.nextBase.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MG_Positive extends LoginPage {

   // public Object favoriteIcon;     // CHENGE THE FIELD
  //  public WebElement[] getAttribute() {   //CHANGE THE FIELD
      //  return new WebElement[0];
  //  }

    public MG_Positive() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id=\"blg-post-1884\"]")
    public WebElement blogPost;

    @FindBy(xpath = "(//a[@class=\"bx-ilike-text\"])[1]")
    public WebElement postLike;

    public WebElement setLikeHover() {
        Actions action = new Actions(Driver.getDriver());
        //WebElement cancelButtonHoverColor = postLike;
        action.moveToElement(postLike).perform();
        return postLike;
    }

    @FindBy(xpath = "//div[@title='Like']")
    public WebElement like;

    @FindBy(xpath = "//div[@title=\"Kiss\"]")
    public WebElement kiss;


    @FindBy(xpath = "//div[@title=\"Laugh\"]")
    public WebElement laugh;

    @FindBy(xpath = "//div[@title=\"Wonder\"]")
    public WebElement wonder;

    @FindBy(xpath = "//div[@title=\"Cry\"]")
    public WebElement cry;

    @FindBy(xpath = "//div[@title=\"Angry\"]")
    public WebElement angry;

    @FindBy(xpath = "(//a[@class='feed-com-add-link'][normalize-space()='Add comment'])[1]")
    public WebElement addComment;

    @FindBy(xpath = "/html[1]/body[1]")
    public WebElement commentBody;

    @FindBy(xpath = "//div[@class=\"feed-add-post-buttons\"]//button")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'][normalize-space()='Like'])[2]")
    public WebElement commentLike;

    @FindBy(xpath = "//a[@id='record-BLOG_1884-378-actions-reply']")
    public WebElement commentReply;

    @FindBy(xpath = "(//span[@class=\"feed-post-emoji-icon-container\"])[2]//span")
    public WebElement commentLikeInteraction;

    @FindBy(xpath = "//div[contains(text(), 'Test Comment Qa')]")
    public WebElement commentVisible;

//    @FindBy(xpath = "//a[@class=\"feed-post-user-name\"]")
//    public WebElement reviewerName;

    public By reviewerName = By.xpath("//div[@class=\"feed-com-user-box\"]//a");

    public List<WebElement> reviewerName() {
        return Driver.getDriver().findElements(reviewerName);
    }

    @FindBy(xpath = "//td[contains(text(),'Contact information')]")
    public WebElement contactInformation;

    @FindBy(xpath = "")
    public WebElement favoriteIcon;

    @FindBy(xpath = "//div[@class=\"feed-post-block feed-post-block-short feed-post-block-separator\"][1]")
    public WebElement firstPost;



    @FindBy(xpath = "//a[@href='#like'][1]")   // NEED  TO CHECK
    public WebElement likeButton;

    @FindBy(css = "#log_entry_favorites_3426")    // DOUBLE CHECK
    public WebElement starIcon;

    @FindBy(css = "#bx-im-scroll-wrap")
    public WebElement addStarToFavourite;           // DOUBLE CHECK

    }


/*

 @FindBy(xpath = "//a[@href='/stream/']")  //OK
    public WebElement activityStream;


    @FindBy(xpath = "//a[@href='#like'][1]")   //OK
    public WebElement likeButton;

    @FindBy(css = ".feed-post-emoji-icon-like")  //OK
    public WebElement likeIcon;

     @FindBy(css = "a.bx-ilike-text")
     public  WebElement emojiContainer;





    @FindBy(css = "#log_entry_favorites_3426")    // StarToFavourite OK
    public WebElement starIcon;

    public By emojiContainer() {
        WebElement firstPost = Driver.getDriver().findElement(By.cssSelector(".feed-item-wrap:nth-of-type(1)"));

        WebElement likeLink = firstPost.findElement(By.cssSelector("a.bx-ilike-text"));
        Actions hoverActions = new Actions(Driver.getDriver());
        hoverActions.moveToElement(likeLink).perform();
        Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return null;

 */



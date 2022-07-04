package com.nextBase.step_definitions;

import com.nextBase.pages.NEXT889;
import com.nextBase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Insert_Video {

    NEXT889 next889 = new NEXT889();

    @When("User clicks the Insert video icon")
    public void user_clicks_the_insert_video_icon() {

            next889.insertVideoIcon.click();


    }

    @When("User paste https:\\/\\/www.youtube.com\\/watch?v=Xd5KFlwF6zM on the Video source bar")
    public void user_paste_https_www_youtube_com_watch_v_xd5k_flw_f6z_m_on_the_video_source_bar() throws InterruptedException {

        next889.inputUrl.sendKeys("https://vimeo.com/718338402");

    }

    @When("User clicks save button")
    public void user_clicks_save_button() throws InterruptedException {

        Thread.sleep(10000);
        if (next889.videoSourceTextBox.isDisplayed()) {
            System.out.println("It is working");
        } else {
            throw new NoSuchElementException();
        }
        next889.insertVideoSaveButton.click();
    }

    @When("User paste https:\\/\\/vimeo.com\\/{int} in Link Textbox")
    public void user_paste_https_vimeo_com_in_link_textbox(Integer int1) {

    }

    @Then("User should see the Video title, video size and video itself")
    public void user_should_see_the_video_title_video_size_and_video_itself() {

    }
}

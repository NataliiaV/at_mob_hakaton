package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.epam.at.utils.driver.DriverRepository.getAndroidDriver;

public abstract class Element {

    protected WebElement element;

    protected Element(WebElement element){
        this.element = element;
    }

    public void click() {
        element.click();
    }

    public void waitForVisibility(int ms){
        new WebDriverWait(getAndroidDriver(), ms/1000).until(ExpectedConditions.presenceOfElementLocated(By.id(getAttribute("id"))));
    }

   public String getTagName() {
        return element.getTagName();
    }

    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

    public boolean isSelected() {
        return element.isSelected();
    }

    public boolean isEnabled() {
        return element.isEnabled();
    }

    public String getText() {
        return element.getText();
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    public Point getLocation() {
        return element.getLocation();
    }

    public Dimension getSize() {
        return element.getSize();
    }

    public Rectangle getRect() {
        return element.getRect();
    }

    public String getCssValue(String s) {
        return element.getCssValue(s);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return element.getScreenshotAs(outputType);
    }
}

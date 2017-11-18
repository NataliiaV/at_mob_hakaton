package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Pattern;

import static com.epam.at.utils.driver.DriverRepository.getAndroidDriver;

public class Email extends Element {

    private Pattern pattern = Pattern.compile("-?\\d{9}");

    public Email(WebElement element) {
        super(element);
    }

    int getSecretCode(){
        return Integer.parseInt(pattern.matcher(element.getAttribute("contentDescription")).group(1));
    }

    @Override
    public void waitForVisibility(int ms) {
        new WebDriverWait(getAndroidDriver(), ms/1000).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@//*[@contentDescription='" + getAttribute("contentDescription") + "']")));
    }
}

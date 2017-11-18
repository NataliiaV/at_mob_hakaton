package elements;

import org.openqa.selenium.WebElement;

public class Input extends Element {
    public Input(WebElement element) {
        super(element);
    }

    void type(CharSequence... charSequences){
        element.sendKeys(charSequences);
    }

}

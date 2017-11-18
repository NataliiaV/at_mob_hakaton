package elements;

import org.openqa.selenium.WebElement;

import java.util.regex.Pattern;

public class CodeEmail extends Email {

    private Pattern pattern = Pattern.compile("-?\\d{9}");


    public CodeEmail(WebElement element) {
        super(element);
    }

    public int getSecretCode(){
        return Integer.parseInt(pattern.matcher(element.getAttribute("contentDescription")).group(1));
    }

}

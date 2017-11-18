package com.epam.at.utils;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.testng.Reporter;

public class ReportAppender extends AppenderSkeleton {

    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
    }

    public boolean requiresLayout() {
        return true;
    }

    @Override
    protected void append(LoggingEvent event) {
        String log = getLayout().format(event);
        if (log.contains("png")) {
            System.setProperty("org.uncommons.reportng.escape-output", "false");
            Reporter.log("<br>" + log + "<br>");
            String[] logParts = log.split("Screenshot path:");
            String screenshotPath = logParts.length == 2? logParts[1] : "Regex_Is_Broken";
            Reporter.log("<img src='" + screenshotPath + "' hight='800' width='500'/> ");
            Reporter.setCurrentTestResult(null);
        } else {
            Reporter.log("<br>" + log, false);
        }
    }
}
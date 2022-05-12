package com.bank.utility.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtenReportManager {
    public static ExtentSparkReporter sparkReporter;
    public static ExtentReports reports;
    public static ExtentTest test;

    public static ExtentReports getReports() {
        if (reports == null) {
            sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extent.html")
                    .viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD, ViewName.TEST,
                            ViewName.CATEGORY}).apply();
            sparkReporter.config().setDocumentTitle("Automation Report");
            sparkReporter.config().setReportName("XYZ Bank");
            sparkReporter.config().setTheme(Theme.DARK);
            reports = new ExtentReports();
            reports.attachReporter(sparkReporter);
            reports.setSystemInfo("User Name", System.getProperty("user.name"));
            reports.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
            reports.setSystemInfo("Machine", "Windows 10" + "64 Bit");
            reports.setSystemInfo("Selenium", "3.141.59");
            reports.setSystemInfo("Maven", "3.5.9");
            reports.setSystemInfo("Java Version", "1.8.0_151");
        }
        return reports;
    }
}

package com.wavenet;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber-reports/cucumber.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        featureOverviewChart = true,
//      jsonUsageReport = "target2/cucumber-usage.json",
//      jsonUsageReport = "target/cucumber-reports/cucumber.json",
//      usageReport = true,
        screenShotLocation = "/screenshots/",
        screenShotSize = "300px",
        toPDF = true,
        excludeCoverageTags = {"@flaky" },
        includeCoverageTags = {"@passed" },
        outputFolder = "target")

@CucumberOptions(
        plugin= {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
        features = {"src/test/resources/stories/Login.feature"},
        glue = {"com.wavenet.stepDefinition"},
        strict = true
        //    tags = "@regression"x
)

public class TestRunner {


}

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/stories/",glue={"com.wavenet.stepDefinition"},plugin = { "pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
//        monochrome = true)
//
//public class TestRunner{
//
//}
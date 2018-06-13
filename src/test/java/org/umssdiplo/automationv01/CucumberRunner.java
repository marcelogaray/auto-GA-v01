package org.umssdiplo.automationv01;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features"},
        //glue = {"'--glue org.umssdiplo.automationv01 ' +"}
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"},
        tags = { "@bvt"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests{
}

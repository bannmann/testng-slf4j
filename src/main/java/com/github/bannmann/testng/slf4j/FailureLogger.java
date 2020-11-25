package com.github.bannmann.testng.slf4j;

import lombok.extern.slf4j.Slf4j;

import org.kohsuke.MetaInfServices;
import org.testng.ITestListener;
import org.testng.ITestResult;

@Slf4j(topic = "TestNG")
@MetaInfServices(ITestListener.class)
public class FailureLogger extends TestListenerAdapter
{
    @Override
    public void onTestFailure(ITestResult result)
    {
        log.error("Test failed", result.getThrowable());
    }
}

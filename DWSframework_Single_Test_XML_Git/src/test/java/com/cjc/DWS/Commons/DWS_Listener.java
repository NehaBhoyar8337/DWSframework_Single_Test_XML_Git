package com.cjc.DWS.Commons;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DWS_Listener implements ISuiteListener,ITestListener
{
	public void onStart(ISuite suitestart)
	{
		System.out.println("ISuite onStart Successfull");
	}
	
	public void onFinish(ISuite suitefinish)
	{
		System.out.println("ISuite onFinish Successfull");
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("ITest onStart Successfull");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("ITest onFinish Successfull");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("ITest onTestSucess Successfull");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("ITest onTestFailure Successfull");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("ITest onTestSkipped Successfull");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Itest OnTestFailedButWithinSuccessPercentage Successfull");
		
	}

	public void onTestStart(ITestResult arg0) 
	{
		
		System.out.println("ITest onTestStart Successfull");
	}

}

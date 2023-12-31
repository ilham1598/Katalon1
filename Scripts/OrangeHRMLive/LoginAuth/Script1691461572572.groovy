import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.net.httpserver.Authenticator.Failure

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.testng.Assert
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod

WebUI.openBrowser(url)

WebUI.setText(findTestObject('Object Repository/orangeHRMLive/Page_OrangeHRM/input_Username_username'), username)

WebUI.setText(findTestObject('Object Repository/orangeHRMLive/Page_OrangeHRM/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/orangeHRMLive/Page_OrangeHRM/button_Login'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/orangeHRMLive/Page_OrangeHRM/input_Username_username'), 10)

WebUI.delay(10)



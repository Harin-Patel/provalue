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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://php.inheritxdev.in/pro_value/qa/login')

WebUI.setText(findTestObject('Page_Login - Pro Value/input_Sign in to start your session_email'), 'admin@admin')

WebUI.setEncryptedText(findTestObject('Page_Login - Pro Value/input_Sign in to start your session_password'), 'G4mKHHDDQ1mvpRb21rOHaQ==')

WebUI.click(findTestObject('Page_Login - Pro Value/input_Remember Me_btn btn-primary'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login - Pro Value/span_These credentials do not match our records'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Pro Value/input_Sign in to start your session_email'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Pro Value/input_Sign in to start your session_password'), 
    'CVca3j8A0klSD6BZx+hc5A==')

WebUI.click(findTestObject('Object Repository/Page_Login - Pro Value/input_Remember Me_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Login - Pro Value/span_These credentials do not match our records'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Pro Value/input_Sign in to start your session_password'), 
    'G4mKHHDDQ1mvpRb21rOHaQ==')

WebUI.click(findTestObject('Object Repository/Page_Login - Pro Value/input_Remember Me_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Pro Value/img_Sign out_img-responsive'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Pro Value/span_Sign out'))

WebUI.closeBrowser()


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

//WebUI.click(findTestObject('QA Env/Admin/Settings/Password_Settings/Settings Menu'))
WebUI.click(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings tab'))

WebUI.setText(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings Old Password'), 'Ovms@444')

WebUI.setText(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings New Password'), 'Ovms@143')

WebUI.setText(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings Confirm Password'), 'Ovms@143')

WebUI.scrollToElement(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Admin/Settings/Password_Settings/Password Settings SAVE Button'))

WebUI.click(findTestObject('STG Env/Admin/Settings/Password_Settings/Confirmation OK Button'))

WebUI.scrollToElement(findTestObject('STG Env/Admin/Settings/Password_Settings/Settings Label'), 0)


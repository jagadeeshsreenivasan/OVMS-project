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

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Add Visitor'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Manage Visitor Menu'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Select location(s) drop down'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Location Coimbatore'))

//WebUI.clickImage(findTestObject('QA Env/SuperAdmin/Manage_ Visitor/Manage Visitors label'))
WebUI.doubleClick(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/checkbox to select visitor'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/DELETE SELECTED Button'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Delete Reason Comment box'), 'Deleting the Visitor for Testing Purpose')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Delete Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Delete Confirmation OK Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage_ Visitor/Add Visitor'))


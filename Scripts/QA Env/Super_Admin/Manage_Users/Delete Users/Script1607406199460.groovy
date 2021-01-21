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

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Manage Users Menu'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Action option'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Action_Delete option'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Delete user Comment box'), 'Deleting this user for Testing Purpose')

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Delete User button'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Delete User/Confirmation Delete OK Button'))


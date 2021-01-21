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

WebUI.click(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Manage Security Menu'))

WebUI.click(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Manage Security _ Action Option'))

WebUI.click(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Manage Security_Action Delete Security Guard'))

WebUI.setText(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Delete Reason Comment box'), 'Deleting this user for Testing Purpose')

WebUI.click(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Delete Button'))

WebUI.click(findTestObject('QA Env/Admin/Manage Security/Delete Security Guard/Delete confirmation OK Button'))


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
import com.github.javafaker.Faker as Faker
Faker fake = new Faker()
String AdminFirstName = fake.name().firstName()

String AdminLastName = fake.name().lastName()

String mobNumber = fake.phoneNumber().phoneNumber()

String Adminemailid = fake.name().firstName()

String AdminEmployeeid = fake.number().randomNumber()

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Manage Users Menu'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/ADD ADMIN Button'))

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin First Name'), AdminFirstName)

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin Last Name'), AdminLastName)

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin Email ID'), Adminemailid)

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin Mobile Number'), mobNumber)

WebUI.setText(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin Employee ID'), AdminEmployeeid)

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Location Dropdown'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Location Madurai'))

WebUI.scrollToElement(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin SAVE Button'), 0)

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Add Admin SAVE Button'))

WebUI.click(findTestObject('QA Env/SuperAdmin/Manage _Users/Add Admin/Confirmation Pop up OK Button'))


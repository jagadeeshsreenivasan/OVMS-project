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

String SGFirstName = fake.name().firstName()

String SGLastName = fake.name().lastName()

String mobNumber = fake.phoneNumber().phoneNumber()

//String SGsecurityID = fake.number().randomNumber()
String SGemailid = fake.name().firstName()

String SGUserName = fake.name().firstName()

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Manage Users Menu'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/ADD SECURITY GUARD Button'))

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard First Name'), SGFirstName)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Last Name'), SGLastName)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Email ID'), SGemailid + 
    '@gmail.com')

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Mobile Number'), 
    mobNumber)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Security ID'), 'CBE' + 
    '-158')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Location Dropdown'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Location Coimbatore'))

WebUI.scrollToElement(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/SAVE Button'), 0)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Username'), SGUserName)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Password'), 'Qwerty@123')

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Security Guard Confirm Password'), 
    'Qwerty@123')

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/SAVE Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Add Security Guard/Confirmation OK Button'))


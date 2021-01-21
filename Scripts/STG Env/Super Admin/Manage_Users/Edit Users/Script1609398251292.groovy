import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Robot robot = new Robot()

Faker fake = new Faker()

String EditFirstName = fake.name().firstName()

String EditLastName = fake.name().lastName()

String EditmobNumber = fake.phoneNumber().phoneNumber()

String Editemailid = fake.name().firstName()

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Manage Users Menu'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Action option'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Action_Edit Option'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_First Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_First Name'), EditFirstName)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Last Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Last Name'), EditLastName)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Email ID'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Email ID'), Editemailid)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Phone Number'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Phone Number'), EditmobNumber)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Role Dropdown'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Role _ Admin'))

WebUI.scrollToElement(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_ SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_ SAVE Button'))

WebUI.click(findTestObject('STG Env/Super_admin_Login/Manage _Users/Edit User/Edit User_Confirmation OK Button'))


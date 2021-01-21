import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.github.javafaker.Faker as Faker
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Robot robot = new Robot()

Faker fake = new Faker()

String SGFirstName = fake.name().firstName()

String SGLastName = fake.name().lastName()

String mobNumber = fake.phoneNumber().phoneNumber()

String SGemailid = fake.name().firstName()

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Manage Security Menu'))

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Manage Security _ Action Option'))

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Manage Security _ Action Edit Security Guard'))

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_ First Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_ First Name'), SGFirstName)

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_Last Name'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_Last Name'), SGLastName)

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_Email ID'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User_Email ID'), SGemailid + '@gmail.com')

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User _Phone Number'))

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_A)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_A)

robot.keyPress(KeyEvent.VK_DELETE)

robot.keyRelease(KeyEvent.VK_DELETE)

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User _Phone Number'), mobNumber)

WebUI.scrollToElement(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User SAVE Button'), 0)

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User To Update Password for SG checkbox'))

WebUI.scrollToElement(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User SAVE Button'), 0)

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User To Create New Password'), 'Ovms@553')

WebUI.setText(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User To Confirm Password'), 'Ovms@553')

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Edit User SAVE Button'))

WebUI.click(findTestObject('STG Env/Admin/Manage Security/Edit Security Guard/Confirmation OK Button'))


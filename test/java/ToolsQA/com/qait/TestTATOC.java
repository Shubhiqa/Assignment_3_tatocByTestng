package ToolsQA.com.qait;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTATOC {

	SessionInitiator test;
	
	@BeforeClass
	public void open()
	{
		test = new SessionInitiator();	
	}
	
	@Test
	public void TC_01_laucnhURL() {
		test.launchurl();
	}
	
	@Test
	public void TC_02_BasicCourseVerify() throws InterruptedException
	{
		test.action.clickOnBasicCourse();
		test.action.verifyURL("http://10.0.1.86/tatoc/basic/grid/gate");
	}
	
	@Test
	public void TC_03_GreenBoxClickVerify()
	{
		test.action.greenBoxClick();
		test.action.verifyGreenBoxClick("http://10.0.1.86/tatoc/basic/frame/dungeon");
	}
	
	@Test
	public void TC_04_RepaintBoxVerify()
	{
		test.action.RepaintBox();
		test.action.verifyPageAfterRepaint("http://10.0.1.86/tatoc/basic/drag");
	}
	
	@Test
	public void TC_05_DragandDrop()
	{
		test.action.dragAndDropBox();
		test.action.clickOnProceed();
		test.action.verifydraganndDrop("http://10.0.1.86/tatoc/basic/windows");
	}
	
	@Test
	public void TC_06_PopUpWindow()
	{
		test.action.popup_window();
		test.action.verifyPopUp("http://10.0.1.86/tatoc/basic/cookie");
	}
	@Test
	public void TC_07_generatetoken()
	{
		test.action.generateToken();
		test.action.verify_generateToken("http://10.0.1.86/tatoc/error");
	}
}
